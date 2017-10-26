package com.wade.ice.client;

import com.wade.ice.service.demo.HelloPrx;
import com.wade.ice.service.demo._HelloPrxI;

public class Client {
	public static void main(String[] args) {
		try (com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args)) {
			com.zeroc.Ice.ObjectPrx base = communicator.stringToProxy("SimplePrinter:default -p 9654");
			HelloPrx helloPrx = HelloPrx.uncheckedCast(base);
			if (helloPrx == null) {
				throw new Error("Invalid proxy");
			}
			String result=helloPrx.sayHello("hello,world.");
			System.out.println(result);
			
		}
	}
}
