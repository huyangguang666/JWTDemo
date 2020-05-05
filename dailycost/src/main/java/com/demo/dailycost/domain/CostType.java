package com.demo.dailycost.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cost_type")
@DynamicInsert
@DynamicUpdate
public class CostType {

    @Id
    @GenericGenerator(name = "uuidG", strategy = "uuid2")
    @GeneratedValue(generator = "uuidG")
    private String id;

    private String name;

    private String userId;

    @Column(name = "is_delete")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isDelete = false;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime = new Date();
}
