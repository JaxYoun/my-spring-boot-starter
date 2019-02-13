package com.yang.myspringbootstarter.config;

import com.yang.myspringbootstarter.service.MsgService;
import com.yang.myspringbootstarter.service.MsgServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author: Yang
 * @date: 2019/2/13 13:48
 * @description:
 * @ConditionalOnClass(MsgServiceImpl.class) //当classpath下存在指定类时，才执行本属性装配操作。
 * @EnableConfigurationProperties(MsgProperties.class) //指定本次属性装配对应的属性类。
 * //检查运行时环境中是否存在指定配置属性项，matchIfMissing字段代表如果不存在是否满足匹配条件。
 * @ConditionalOnProperty(prefix = "msg", value = "enable", matchIfMissing = true)
 */
@Configuration
@ConditionalOnClass(MsgServiceImpl.class)
@EnableConfigurationProperties(MsgProperties.class)
@ConditionalOnProperty(prefix = "msg", value = "enable", matchIfMissing = true)
public class MsgAutoConfig {

    @Resource
    private MsgProperties msgProperties;

    @Bean
    @ConditionalOnMissingBean(MsgServiceImpl.class)
    public MsgService msgService() {
        return new MsgServiceImpl(this.msgProperties);
    }

}
