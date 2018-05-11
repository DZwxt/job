package com.dw.login.config;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

public class BDSessionListener implements SessionListener{
	
	private AtomicInteger atomicInteger = new AtomicInteger(0);

	@Override
	public void onStart(Session session) {
		atomicInteger.incrementAndGet();
		
	}

	@Override
	public void onStop(Session session) {
		atomicInteger.decrementAndGet();
		
	}

	@Override
	public void onExpiration(Session session) {
		atomicInteger.decrementAndGet();
		
	}

}
