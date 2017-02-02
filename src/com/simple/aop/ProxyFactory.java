package com.simple.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory extends Proxy
{
	public ProxyFactory(final InvocationHandler h)
	{
		super(h);
	}

	public void getProxyObj()
	{
		// Enh
	}
}
