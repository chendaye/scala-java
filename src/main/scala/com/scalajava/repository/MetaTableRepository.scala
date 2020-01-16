package com.scalajava.repository


import com.scalajava.model.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable, Integer]{

}

