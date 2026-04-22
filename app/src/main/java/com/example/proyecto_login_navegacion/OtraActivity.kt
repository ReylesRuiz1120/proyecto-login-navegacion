package com.example.proyecto_login_navegacion
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class OtraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = android.view.Gravity.CENTER

        val texto = TextView(this)
        texto.text = "Esta es otra pantalla"
        texto.textSize = 22f

        val btnVolver = Button(this)
        btnVolver.text = "Volver"

        layout.addView(texto)
        layout.addView(btnVolver)

        setContentView(layout)

        btnVolver.setOnClickListener {

            val intent =
                Intent(this,
                    HolaActivity::class.java)

            startActivity(intent)

            finish()
        }
    }
}