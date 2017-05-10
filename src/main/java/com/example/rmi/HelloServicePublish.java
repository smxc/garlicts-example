//package com.example.rmi;
//
//import java.rmi.RemoteException;
//
//import com.garlicts.framework.ioc.annotation.Autowired;
//import com.garlicts.framework.plugin.distributed.rmi.RmiProviderTemplate;
//
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
