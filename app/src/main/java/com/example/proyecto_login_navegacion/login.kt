package com.example.proyecto_login_navegacion
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
class login : AppCompatActivity ( ){



    //  credenciales simples
    var usuarioRegistrado = "admin"
    var passwordRegistrado = " 1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40,40,40,40)

        val etUsuario = EditText(this)
        etUsuario.hint = " Usuario"
        val etPassword = EditText(this)
        etPassword.hint = " Contraseña "
        val btnlogin = Button ( this )
        btnlogin.text = "Iniciar Sesion"
        val btnRegistrar = Button(this)
        btnRegistrar.text = "Refistrarse "

        layout.addView(etUsuario)
        layout.addView(etPassword)
        layout.addView(btnlogin)
        layout.addView(btnRegistrar)

        setContentView(layout)
        //login
        btnlogin.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val password = etPassword.text.toString()
            if (usuario == usuarioRegistrado && password == passwordRegistrado)
            {
                val intent = Intent(this,HolaActivity::class.java)
              startActivity(intent)}

        else {

            Toast.makeText(
                this,
                "Credenciales incorrectas",
                Toast.LENGTH_SHORT
            ).show()

        }
    }

    // REGISTRO
    btnRegistrar.setOnClickListener {

        val intent =
            Intent(this,
                Registro::class.java)

        startActivity(intent)
    }
        }
    }



