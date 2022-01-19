package mx.kodemia.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio.*
import android.text.Editable
import android.text.TextWatcher

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        tietPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(editPass: Editable?) {
                if (editPass.toString().trim().isEmpty()) {
                    tilPassword.setError("Password Required")
                } else{
                    tilPassword.setErrorEnabled(false)
                    tilPassword.setError("")
                }
            }
        })

        buttonLogin.setOnClickListener{
            startActivity(Intent(this, Registro::class.java))
        }

        textView2.setOnClickListener{
            startActivity(Intent(this, Registro::class.java))
        }
    }
}