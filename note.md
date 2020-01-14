# 项目技术栈
> Spring Boot + Spring Data JPA + Scala + Java 混合编程

scala 也是基于 jvm , 可以与java混合编程。 同时，也可以调用java中已有的工具

# 项目需求

> 元数据管理： MateStore

- 采集
- 维护
- 稽查
- 分析

> 任务

- 数据库管理 default imooc-db1  imooc-db2
    id:数据库编号
    name：数据库名称
    location：数据库存放在HDFS/S3/OSS等文件系统上
        /usr/hive/warehouse
        /usr/hive/warehouse/imooc-db1
     java 语言实现
- 表管理  imooc-table1 imooc-table2
    id:表编号
    name：表名称
    tableType: 表类型  内部表/外部表(面试)
    dbId：该表所属的数据库id
        默认存储路径： db对应的location/tableName
     Scala 语言实现
     
     
# 开发环境

IDEA + Spring Boot + Data + Scala