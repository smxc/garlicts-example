//package com.garlicts.test.rmi;
//
//import java.rmi.RemoteException;
//
//import com.garlicts.ioc.annotation.Autowired;
//import com.garlicts.plugin.distributed.rmi.RmiProviderTemplate;
//
//public class HelloServicePublish {
//
//	@Autowired
//	RmiProviderTemplate rmiProviderTemplate;
//	
//	public String a(){
//		try {
//			rmiProviderTemplate.publish(new HelloServiceImpl(), "helloServiceImpl", "127.0.0.1", 20006);
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
//		return "";
//	}
//	
//}
