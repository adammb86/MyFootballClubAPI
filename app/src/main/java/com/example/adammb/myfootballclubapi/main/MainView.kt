package com.example.adammb.myfootballclubapi.main

import com.example.adammb.myfootballclubapi.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}