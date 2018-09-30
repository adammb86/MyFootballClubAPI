package com.example.adammb.myfootballclubapi.api

import java.net.URL

class ApiRepository {

    fun doRequest(url: String): String{
        return URL(url).readText()
    }
}