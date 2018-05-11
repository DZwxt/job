package com.dw.login.shiro;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.dw.login.config.ApplicationContextRegister;
import com.dw.login.servicd.MenuService;
import com.dw.login.util.ShiroUtils;

import domain.UserDO;

public class UserRealm extends CasRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		Long userId = ShiroUtils.getUserId();
		MenuService menuService = ApplicationContextRegister
				.getBean(MenuService.class);
		Set<String> perms = menuService.getPerms(userId);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(perms);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", username);
		UserDao userMapper = ApplicationContextRegister.getBean(UserDao.class);
		UserDO user = userMapper.list(map).get(0);
		// 用户名不存在
		if (user == null) {
			throw new UnknownAccountException("用户名或密码错误");
		}
		if (!password.equals(user.getPassword())) {
			throw new IncorrectCredentialsException("用户名或密码不正确");
		}
		if (user.getStatus() == 0) {
			throw new LockedAccountException("该帐号暂停使用");
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
				password, getName());
		return info;
	}
}
