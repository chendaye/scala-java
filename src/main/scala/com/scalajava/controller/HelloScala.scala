package com.scalajava.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class HelloScala {
  @RequestMapping(value = Array("/sayScala"), method = Array(RequestMethod.GET))
  def sayScalaHello() = "Hello Scala ...."
}
