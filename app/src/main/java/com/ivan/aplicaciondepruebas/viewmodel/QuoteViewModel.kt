package com.ivan.aplicaciondepruebas.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ivan.aplicaciondepruebas.model.QuoteModel
import com.ivan.aplicaciondepruebas.model.QuoteProvider

class QuoteViewModel :ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentCuote = QuoteProvider.random()
        quoteModel.postValue(currentCuote)
    }


}