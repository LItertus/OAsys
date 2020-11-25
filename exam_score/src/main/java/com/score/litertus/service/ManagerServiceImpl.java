package com.score.litertus.service;

import com.score.litertus.dao.managerDao;
import com.score.litertus.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private managerDao managerDao;

    @Override
    public void register(Manager manager){
        manager.setStatus("已激活");
        manager.setRegisterTime(new Date());
        managerDao.save(manager);
    }

//    @Override
//    public void login(Manager manager){
//
//    }
}
