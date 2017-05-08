//package com.example.rmi;
//
//import com.garlicts.framework.plugin.distributed.rmi.RmiConsumerTemplate;
//
//public class Client {
//	public static void main(String[] args) throws Exception {
//		
//		RmiConsumerTemplate consumer = new RmiConsumerTemplate();
//		HelloService helloService2 = consumer.lookup("helloService2");
//		String result = helloService2.sayHello("Jack");
//		System.out.println(result);
//		Thread.sleep(3000);
//		
//	}
//}
