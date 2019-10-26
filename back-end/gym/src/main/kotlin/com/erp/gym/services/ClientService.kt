package com.erp.gym.services

import com.erp.gym.domain.Client
import com.erp.gym.domain.IClientService
import com.erp.gym.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService:IClientService {

    @Autowired
    private lateinit var  clientRepository:ClientRepository

    override fun findId(id: Int): Iterable<Client> {
        val ret = clientRepository.findById(id)
        return ret
    }

    override fun findAll():Iterable<Client> {
        val ret = clientRepository.findAll()
        return ret
    }

    override fun findUser(name: String, surname: String):List<Client> {
        val ret = clientRepository.findUser(name,surname)
        return ret
    }
}