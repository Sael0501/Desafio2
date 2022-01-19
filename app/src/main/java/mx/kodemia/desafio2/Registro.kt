package mx.kodemia.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        textView6.setOnClickListener{
            startActivity(Intent(this,Inicio::class.java))
        }
        buttonR.setOnClickListener{
            startActivity(Intent(this,PantallaPrincipal::class.java))
        }

        tietUsuarioR.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(editUser: Editable?) {
                if(editUser.toString().trim().isEmpty()){
                    tilUsuarioR.setError("Ingrese un usuario")
                }else{
                    tilUsuarioR.setErrorEnabled(false)
                    tilUsuarioR.setError("")
                }
            }
        })

        tietCorreoR.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(editUser: Editable?) {
                if(editUser.toString().trim().isEmpty()){
                    tilCorreoR.setError("Ingrese un Email")
                }else{
                    tilCorreoR.setErrorEnabled(false)
                    tilCorreoR.setError("")
                }
            }
        })

        tietPasswordR.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(editUser: Editable?) {
                if(editUser.toString().trim().isEmpty()){
                    tilPasswordR.setError("Ingrese una contrasena")
                }else{
                    tilPasswordR.setErrorEnabled(false)
                    tilPasswordR.setError("")
                }
            }
        })

        tietConPasswordR.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(editUser: Editable?) {
                if(editUser.toString().trim().isEmpty()){
                    tilConPasswordR.setError("Confirme su contrasena")
                }else{
                    tilConPasswordR.setErrorEnabled(false)
                    tilConPasswordR.setError("")
                }
            }
        })

    }
}