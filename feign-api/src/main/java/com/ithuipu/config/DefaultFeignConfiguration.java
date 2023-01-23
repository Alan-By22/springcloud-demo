package com.ithuipu.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @className: DefaultFeignLogger
 * @author: Mr.BingYu
 * @description:
 * @date: 2023/01/23 17:24
 **/


public class DefaultFeignConfiguration {

    @Bean
    public Logger.Level feignLogger() {
        return Logger.Level.BASIC;    //修改默认的bean,日志级别
    }
}
