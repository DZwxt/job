package com.dw.login.servicd;

import java.util.Set;

public interface MenuService {
	Set<String> getPerms(Long userId);
}
