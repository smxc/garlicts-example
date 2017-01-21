package com.garlicts.test.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements HelloService{

	private static final long serialVersionUID = -8822998728926254998L;

	protected HelloServiceImpl() throws RemoteException {
		super();
		
	}

	@Override
	public String sayHello(String name) throws RemoteException {
		return String.format("demo2 Hello %s", name);
	}
  
}
