package com.example.proyecto_login_navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class HolaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = android.view.Gravity.CENTER

        val texto = TextView(this)
        texto.text = "Hola Mundo"
        texto.textSize = 24f

        val btnOtra = Button(this)
        btnOtra.text = "Ir a otra pantalla"

        val btnCerrar = Button(this)
        btnCerrar.text = "Cerrar sesión"

        layout.addView(texto)
        layout.addView(btnOtra)
        layout.addView(btnCerrar)

        setContentView(layout)

        // Ir a otra pantalla
        btnOtra.setOnClickListener {

            val intent =
                Intent(this,
                    OtraActivity::class.java)

            startActivity(intent)
        }

        // Cerrar sesión
        btnCerrar.setOnClickListener {

            val intent =
                Intent(this,
                    LoginActivity::class.java)

            startActivity(intent)

            finish()
        }
    }
}