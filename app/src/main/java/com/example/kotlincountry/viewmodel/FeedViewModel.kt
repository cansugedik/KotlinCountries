package com.example.kotlincountry.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlincountry.model.Country

class FeedViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryError = MutableLiveData<Boolean>()
    val countryLoading = MutableLiveData<Boolean>()

    fun refreshData() {

        val country = Country("Turkey", "Asia", "Ankara", "TRY", "Türkçe", "www.ss.com")
        val country1 = Country("France", "Europe", "Paris", "EURO", "French", "www.ss.com")
        val country2 = Country("Germany", "Europe", "Berlin", "EURO", "German", "www.ss.com")

        val countryList = arrayListOf<Country>(country, country1, country2)

        countries.value = countryList
        countryError.value = false
        countryLoading.value = false

    }

}