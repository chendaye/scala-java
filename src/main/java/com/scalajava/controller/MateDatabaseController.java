package com.scalajava.controller;

import com.scalajava.domain.MetaDatabase;
import com.scalajava.service.MetaDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta/database")
public class MateDatabaseController {
//    @Autowired
//    private MetaDatabaseService metaDatabaseService; // 依赖注入
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String save(@ModelAttribute MetaDatabase metaDatabase){
//        metaDatabaseService.save(metaDatabase);
//        return "success";
//    }
}
