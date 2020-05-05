package com.demo.dailycost.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GenericGenerator(name = "uuidG", strategy = "uuid2")
    @GeneratedValue(generator = "uuidG")
    private String id;

    private String loginName;

    private String password;

    @Enumerated(EnumType.STRING)
    private Sex sex = Sex.Unknow;

    private String nickName;

    private String head;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime = new Date();

    public enum Sex {

        /**
         * 男
         */
        Man,

        /**
         * 女
         */
        Woman,

        /**
         * 未知
         */
        Unknow;
    }
}
