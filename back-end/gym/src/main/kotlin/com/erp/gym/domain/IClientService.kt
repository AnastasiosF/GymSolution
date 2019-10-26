package com.erp.gym.domain

interface IClientService {
    fun findId(id:Int):Iterable<Client>
    fun findAll():Iterable<Client>
    fun findUser(username:String,surname:String):Iterable<Client>

}