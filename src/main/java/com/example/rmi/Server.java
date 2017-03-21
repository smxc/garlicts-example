package com.example.rmi;
//package com.garlicts.test.rmi;
//
//import com.garlicts.plugin.distributed.rmi.RmiProviderTemplate;
//
//public class Server {
//	 public static void main(String[] args) throws Exception {
//	 
//		 	/**
//		 	 * 模拟两台服务器，发布同一个rmi接口服务  helloService2
//		 	 */
//		 
//	        String host1 = "127.0.0.1";
//	        int port1 = 20004;
//	        RmiProviderTemplate provider1 = new RmiProviderTemplate();
//	        HelloService helloService2 = new HelloServiceImpl();
//	        provider1.publish(helloService2, "helloService2", host1, port1);
//	        
//	        String host2 = "127.0.0.1";
//	        int port2 = 20005;
//	        RmiProviderTemplate provider2 = new RmiProviderTemplate();
//	        HelloService helloService22 = new HelloServiceImpl();
//	        provider2.publish(helloService22, "helloService2", host2, port2);	        
//	  
//	        Thread.sleep(Long.MAX_VALUE);
//	    }
//}
