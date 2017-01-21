//package com.garlicts.test.rmi;
//
//import com.garlicts.plugin.distributed.rmi.RmiConsumerTemplate;
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
