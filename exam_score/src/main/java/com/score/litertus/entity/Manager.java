package com.score.litertus.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class Manager {
    private int Uid;
    private String account;
    private String password;
    private String sex;
    private String status;
    private Date registerTime;
    private int permisson;

}
