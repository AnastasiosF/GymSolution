package com.erp.gym.controller

import com.erp.gym.domain.Client
import org.springframework.web.bind.annotation.RestController
import com.erp.gym.repository.ClientRepository
import com.erp.gym.services.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping


@RestController
@RequestMapping("/api/v1")
class ClientController {

    @Autowired
    private lateinit var clientService:ClientService

    /*@RequestMapping("/findid/{id}")
    fun findid() = clientService.findId(id)*/

    @RequestMapping("/findId/{id}")
    fun findId(@PathVariable id:Int):Iterable<Client>{
        return clientService.findId(id)
    }

    @RequestMapping("/findAll")
    fun findAll():Iterable<Client>{
        return clientService.findAll()
    }

    @RequestMapping("/find/{surname}/{name}")
    fun findUser(@PathVariable name:String,@PathVariable surname:String):Iterable<Client>{
        return clientService.findUser(name, surname)
    }

}