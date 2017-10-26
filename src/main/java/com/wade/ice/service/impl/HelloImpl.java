package com.wade.ice.service.impl;

import com.wade.ice.service.demo.Hello;
import com.zeroc.Ice.Current;

public class HelloImpl implements Hello {
	private static final long serialVersionUID = -3966457693815687559L; 
	@Override
	public String sayHello(String s, Current current) {
		System.err.println(s);
		return "hello "+s;
	}

}
