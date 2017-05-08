package com.example.aspect;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garlicts.framework.aop.AspectProxy;
import com.garlicts.framework.aop.annotation.Aspect;
import com.garlicts.framework.mvc.GarlictsContext;

/**
 * 自定义一个业务执行耗时切面
 * 	切入 com.garlicts.test.controller目录下的所有类
 */
@Aspect(packageName="com.example.controller")
public class RequestTimeAspect extends AspectProxy {

	Logger logger = LoggerFactory.getLogger(RequestTimeAspect.class);
	
	ThreadLocal<Long> startTimeThreadLocal = new ThreadLocal<Long>();
	
	@Override
	public void before(Class<?> targetClass, Method targetMethod, Object[] methodParams) {
		startTimeThreadLocal.set(System.currentTimeMillis());
	}

	@Override
	public void after(Class<?> targetClass, Method targetMethod, Object[] methodParams, Object result) {
		
		long costTime = System.currentTimeMillis() - startTimeThreadLocal.get();
		
		String requestURI = GarlictsContext.getRequest().getRequestURI();
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("请求URI：")
			.append(requestURI)
			.append("； 耗时为：")
			.append(costTime)
			.append(" 毫秒");
		logger.info(stringBuffer.toString());
		
		startTimeThreadLocal.remove();
		
	}

	
	
}
