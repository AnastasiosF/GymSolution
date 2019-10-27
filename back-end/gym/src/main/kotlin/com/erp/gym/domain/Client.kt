package com.erp.gym.domain

import java.sql.Date
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "clients")
class Client(
        @Id
        @Column(name = "id")
        val id: Int,
        @Column(name = "name")
        val name: String,
        @Column(name = "surname")
        val surname: String,
        @Column(name = "birth")
        val birth: Date,
        @Column(name = "address")
        val address: String)  {

}