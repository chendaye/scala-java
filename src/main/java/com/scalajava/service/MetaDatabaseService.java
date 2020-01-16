package com.scalajava.service;

import com.scalajava.model.MetaDatabase;
import com.scalajava.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


/**
 * 业务逻辑层
 * */
@Service
public class MetaDatabaseService  {
//    @Autowired //大体意思就是就是说用了它就可以省去类里面的set/get方法，也不用在xml文件中要注入的类中设置属性，它会根据@Autowired注释自动完成
//    private MetaDatabaseRepository metaDatabaseRepository;

    private MetaDatabaseRepository metaDatabaseRepository;
    public void setMetaDatabaseRepository(MetaDatabaseRepository metaDatabaseRepository){
        this.metaDatabaseRepository = metaDatabaseRepository;
    }
    /**
     * 保存方法
     * 调用底层crud 方法
     * */
    @Transactional
    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }

    /**
     * 查询数据
     * 调用底层 crud方法
     * */
    @Transactional
    public Iterable<MetaDatabase> query(){
        return metaDatabaseRepository.findAll();
    }
}
