package com.scalajava.repository;

import com.scalajava.model.MetaDatabase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



/**
 * 对数据表的操作
 * 继承了底层的CRUD 方法
 * */
@Repository
public interface  MetaDatabaseRepository extends CrudRepository<MetaDatabase, Integer> {
}
