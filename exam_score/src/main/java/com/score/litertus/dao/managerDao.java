package com.score.litertus.dao;

import com.score.litertus.entity.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface managerDao {

    void save(Manager manager);
}
