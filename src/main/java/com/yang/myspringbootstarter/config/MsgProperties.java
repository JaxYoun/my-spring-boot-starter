package com.yang.myspringbootstarter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Yang
 * @date: 2019/2/13 13:46
 * @description:
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "msg")
public class MsgProperties {

    private String id;

    private String name;

}
