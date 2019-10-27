package com.erp.gym.repository

import com.erp.gym.domain.Client
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


@Repository
interface ClientRepository: CrudRepository<Client,Long> {

    fun findById(id: Int): Iterable<Client>

    override fun findAll(): MutableIterable<Client>

    @Query("SELECT * FROM clients WHERE name=:name and surname=:surname",  nativeQuery = true)
    fun findUser( @Param("name") name:String, @Param("surname") surname:String):List<Client>

}