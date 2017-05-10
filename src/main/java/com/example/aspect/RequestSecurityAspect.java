package com.example.aspect;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garlicts.framework.aop.AspectProxy;
import com.garlicts.framework.aop.annotation.Aspect;
import com.garlicts.framework.mvc.GarlictsContext;
import com.garlicts.framework.util.WebUtil;

/**
 * 如果客户端的ip为白名单，则运行访问控制器，否则拒绝方法
 * 如果before方法返回true，则执行控制器的方法 
 * 
 * 拦截com.example.controller.security目录下的控制器，如果客户端IP为192.168.0.10，则before方法返回true，放行继续访问控制器。
 */
@Aspect(packageName="com.example.controller.security")
public class RequestSecurityAspect extends AspectProxy {

	Logger logger = LoggerFactory.getLogger(RequestSecurityAspect.class);
	
	@Override
	public boolean before(Class<?> targetClass, Method targetMethod,
			Object[] methodParams) {
		HttpServletRequest request = GarlictsContext.getRequest();
		String clientIP = WebUtil.getClientIP(request);
		logger.info("clientIP:" + clientIP);
//		if("127.0.0.1".equals(clientIP) || "0:0:0:0:0:0:0:1".equals(clientIP)){
//			return true;
//		}
		if("192.168.0.10".equals(clientIP)){
			return true;
		}
		return false;
	}

	@Override
	public boolean after(Class<?> targetClass, Method targetMethod,
			Object[] methodParams, Object result) {
		return false;
	}

}
