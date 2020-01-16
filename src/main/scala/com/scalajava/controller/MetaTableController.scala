package com.scalajava.controller

import com.scalajava.model.MetaTable
import com.scalajava.service.MetaTableService
import com.scalajava.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._


@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable:MetaTable) = {
    metaTableService.save(metaTable)
    ResultVOUtil.success()  // 此处就是Scala调用已有的Java代码
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @ResponseBody
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }

}

