package com.example.ui_sencilla

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var txtURL  :   EditText?   =   null
    private var web :   WebView?    =   null
    private lateinit var boton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtenemos una referencia a los controles de la interfaz (clase R)
        txtURL = findViewById(R.id.txtURL)
        web = findViewById(R.id.web)
        boton = findViewById(R.id.boton)

        boton.setOnClickListener {
            // Pasamos a la variable url lo escrito en editText
            var url = txtURL?.text.toString()
            // Para no tener el cache
            web?.clearCache(false)
            // Habilitamos los javascripts
            web?.settings?.javaScriptEnabled=true
            // Para que cargue el navegadr la URL
            web?.loadUrl(url)
        }
    }
}