package com.yang.myspringbootstarter.service;

import com.yang.myspringbootstarter.config.MsgProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author: Yang
 * @date: 2019/2/13 14:00
 * @description:
 */
@NoArgsConstructor
@AllArgsConstructor
public class MsgServiceImpl implements MsgService {

    private MsgProperties msgProperties;

    @Override
    public void outputMsg() {
        System.err.println("=========");
        System.err.println(this.msgProperties.getId());
        System.err.println(this.msgProperties.getName());
    }

}
