package com.scalajava.repository;

import com.scalajava.domain.MetaDatabase;
import org.springframework.data.repository.CrudRepository;


/**
 * 对数据表的操作
 * 继承了底层的CRUD 方法
 * */
public interface  MetaDatabaseRepository extends CrudRepository<MetaDatabase, Integer> {
}
