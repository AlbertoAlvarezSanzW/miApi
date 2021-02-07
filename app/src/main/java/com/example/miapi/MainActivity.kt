package com.example.miapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var model : MainActivityViewModel

    private var adapter = AdapterString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // soempre que metamos un ViewModel hemos de mirar el gradel
        // hemos de implementar esto:
        //    implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
        //    implementation 'androidx.fragment:fragment-ktx:1.2.5'



        model = ViewModelProvider(this).get(MainActivityViewModel::class.java)



        GlobalScope.launch {
            var resultados = model.getApliResults()
            adapter.setData(resultados)
        }




    }
}