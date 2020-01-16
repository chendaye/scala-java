package com.scalajava.model;

import javax.persistence.*;

/**
* 数据库元数据
 * 对应于数据表
 * */
@Entity
@Table
public class MetaDatabase {
    /**数据库ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**数据库名称*/
    private String name;

    /**数据库存放文件系统的地址*/
    private String location;

     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
