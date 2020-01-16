package com.scalajava.controller;

import com.scalajava.model.MetaDatabase;
import com.scalajava.service.MetaDatabaseService;
import com.scalajava.utils.ResultVOUtil;
import com.scalajava.utils.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/meta/database")
public class MateDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService; // 依赖注入


    @RequestMapping(value = "/long", method = RequestMethod.GET)
    public ResultVo save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabase.setName("default33");
        metaDatabase.setLocation("hdfs://master:9000/warehouse33");
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/lengo", method = RequestMethod.GET)
    public ResultVo query(){
        return ResultVOUtil.success(metaDatabaseService.query());
    }


}
