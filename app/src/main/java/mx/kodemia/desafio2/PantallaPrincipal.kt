package mx.kodemia.desafio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pantalla_principal.*
import mx.kodemia.desafio2.model.RecyclerView


class PantallaPrincipal : AppCompatActivity() {

    val libros: MutableList<RecyclerView> = mutableListOf()
    var adapterHome = activity?.let {home(libros, requireActivity())}
    var parent_view: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_pantalla_principal, container, false)
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            parent_view = view.findViewById(android.R.id.content)
            initRecyclerHome()
        }

        private fun initRecyclerHome(){
            libros.add(RecyclerView("El evangelio del mal","sabe","Terror"))
            libros.add(RecyclerView("La sombra","sabe","Crimen"))
            libros.add(RecyclerView("Las cronicas de Narnia","sabe","Fantasia"))
            libros.add(RecyclerView("Dracula","sabe","Suspenso"))

            home.layoutManager = LinearLayoutManager(activity)
            home.setHasFixedSize(true)
            adapterHome = activity?.let { home(listLibros, requireActivity()) }
            recyclerView_Home.adapter = adapterHome
        }
    }

}