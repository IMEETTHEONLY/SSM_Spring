package com.spring.service.serviceImpl;

import com.spring.dao.RoseDao;
import com.spring.service.RoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("rose")
public class RoseServiceImpl implements RoseService {

    @Autowired
    private RoseDao roseDao;

    //根据id获取信息
    public Boolean getById(String url,String password){
        return roseDao.check(url,password);
    }
}
