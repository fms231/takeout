package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 * @ClassName AutoFill
 * @Author: fms231
 * @Date: 2025/1/25 下午3:31
 * @Version 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    // Update Insert
    OperationType value();
}
