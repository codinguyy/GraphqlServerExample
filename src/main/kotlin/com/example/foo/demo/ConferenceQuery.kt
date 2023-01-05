package com.example.foo.demo

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component


@Component
class ConferenceQuery: Query {
    fun conference()=Conference("test","sdfsdf")

    fun people()=People("Ron","Schneider")
}

data class Conference(val name:String,val location:String?)
data class People(val surname:String,val lastname:String?)