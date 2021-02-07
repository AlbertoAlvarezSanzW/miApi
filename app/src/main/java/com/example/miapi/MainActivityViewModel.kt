package com.example.miapi

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class MainActivityViewModel : ViewModel(){

    // necesitamos declarar  una función de lo que queramos que nos devuelva
    suspend fun getApliResults() : String {
        // empezamos con la corrutinas y utulizamos un async para que lo que nos devuelva el resultado
        var resultado = GlobalScope.async {
            DownloadManager.downloadApiResults()
        }
        // al poner im await nos machaca todo lo que hay en 2º plano por lo que hemos de meter en una
        // corrutina de tipo glonalscope.
        return resultado.await()
    }
}