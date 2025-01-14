package com.spring.service.serviceImpl;

import com.spring.service.RoseService;
import org.springframework.stereotype.Service;

@Service("rose")
public class RoseServiceImpl implements RoseService {

    //根据id获取信息
    public String getById(int id){
        System.out.println("您传递的id是:"+id);
        int i=1/0;
        //返回字符串
        return "itcast";
    }
}
