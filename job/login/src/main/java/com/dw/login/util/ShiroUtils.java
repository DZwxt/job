package com.dw.login.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import domain.UserDO;

public class ShiroUtils{
	
	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
	
	public static UserDO getUser(){
		return (UserDO) getSubject().getPrincipals();
	}
	
	public static String getUsername(){
		return getUser().getUsername();
	}
	
	public static Long getUserId(){
		return getUser().getUserId();
	}
	
	public void logout(){
		getSubject().logout();
	}

}
