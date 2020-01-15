package com.scalajava.service;

import com.scalajava.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.scalajava.service.MetaDatabaseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {
//    @Autowired
//    private MetaDatabaseService metaDatabaseService;

    @Test
    public void testSave(){
        System.out.println("testSave");
        MetaDatabase metaDatabase = new MetaDatabase(); // 数据表
        metaDatabase.setName("default");
        // hdfs dfs -mkdir /warehouse
        metaDatabase.setLocation("hdfs://master:9000/warehouse");

        // 保存表
        MetaDatabaseService metaDatabaseService = new MetaDatabaseService();
        metaDatabaseService.save(metaDatabase);
    }

    @Test
    public void testQuery(){
        MetaDatabaseService metaDatabaseService = new MetaDatabaseService();
        Iterable<MetaDatabase> metaDatabases = metaDatabaseService.query();
        for(MetaDatabase metaDatabase: metaDatabases){
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getName());
            System.out.println(metaDatabase.getLocation());
        }
    }
}
