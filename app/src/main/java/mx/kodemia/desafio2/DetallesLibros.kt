package mx.kodemia.desafio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detalles_libros.*

class DetallesLibros : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_libros)

        textView13.setOnClickListener{
            startActivity(Intent(this,PantallaPrincipal::class.java))
        }

        val text_button_des: TextView = findViewById(R.id.textView6)
        val text_button_det: TextView = findViewById(R.id.textView10)
        val alter_text: TextView = findViewById(R.id.textView12)

        text_button_des.setOnClickListener {
            alter_text.setText("Esta es una descripción, is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s")
        }

        text_button_det.setOnClickListener {
            alter_text.setText("Estos son los detalles, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum")
        }
    }
}