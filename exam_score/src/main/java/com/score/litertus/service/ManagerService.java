package com.score.litertus.service;

import com.score.litertus.entity.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

public interface ManagerService {

    void register(Manager manager);

//    Manager login(Manager manager);
}
