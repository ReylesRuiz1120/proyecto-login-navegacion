package com.example.proyecto_login_navegacion

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 40, 40, 40)

        val etUsuario = EditText(this)
        etUsuario.hint = "Nuevo usuario"

        val etPassword = EditText(this)
        etPassword.hint = "Nueva contraseña"

        val btnGuardar = Button(this)
        btnGuardar.text = "Guardar"

        layout.addView(etUsuario)
        layout.addView(etPassword)
        layout.addView(btnGuardar)

        setContentView(layout)

        btnGuardar.setOnClickListener {

            Toast.makeText(
                this,
                "Usuario registrado",
                Toast.LENGTH_SHORT
            ).show()

            val intent =
                Intent(this,
                    login::class.java)

            startActivity(intent)

            finish()
        }
    }
}