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
@Table(name = "cost")
@DynamicInsert
@DynamicUpdate
public class Cost {

    @Id
    @GenericGenerator(name = "uuidG", strategy = "uuid2")
    @GeneratedValue(generator = "uuidG")
    private String id;

    @Column(name = "type_id")
    private String typeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", insertable = false, updatable = false)
    private CostType type;

    /**
     * 花费金额 单位：分
     */
    private Double cost;

    private String remark;

    @Temporal(TemporalType.TIMESTAMP)
    private Date costTime;

    @Column(name = "is_delete")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isDelete = false;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creatTime = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime = new Date();
}
