package com.example.aspect;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garlicts.framework.aop.AspectProxy;
import com.garlicts.framework.aop.annotation.Aspect;

/**
 * 自定义一个业务执行耗时切面
 * 	切入 com.garlicts.test.controller目录下的所有类
 */
@Aspect(packageName="com.example.controller")
public class RequestTimeAspect extends AspectProxy {

	Logger logger = LoggerFactory.getLogger(RequestTimeAspect.class);
	
	private long startTime;
	
	@Override
	public void before(Class<?> targetClass, Method targetMethod, Object[] methodParams) {
		startTime = System.currentTimeMillis();
	}

	@Override
	public void after(Class<?> targetClass, Method targetMethod, Object[] methodParams, Object result) {
		long endTime = System.currentTimeMillis() - startTime;
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(targetClass.getName()).append("#")
			.append(targetMethod.getName())
			.append(" 执行耗时为：")
			.append(String.valueOf(endTime))
			.append(" 毫秒");
		logger.info(stringBuffer.toString());
	}

	
	
}
