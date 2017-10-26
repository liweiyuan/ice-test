package com.wade.ice.server;

import com.wade.ice.service.impl.HelloImpl;

public class Server {
	public static void main(String[] args) {
		try (com.zeroc.Ice.Communicator communicator = com.zeroc.Ice.Util.initialize(args)) {
			com.zeroc.Ice.ObjectAdapter adapter = communicator.createObjectAdapterWithEndpoints("SimplePrinterAdapter",
					"default -p 9654");
			com.zeroc.Ice.Object object = new HelloImpl();
			adapter.add(object, com.zeroc.Ice.Util.stringToIdentity("SimplePrinter"));
			adapter.activate();
			communicator.waitForShutdown();
		}
	}
}
