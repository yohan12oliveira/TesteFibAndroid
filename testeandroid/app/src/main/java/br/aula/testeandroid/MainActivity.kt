package br.aula.testeandroid

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_basico.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_basico)

       // texto1.text
        // texto2.text
        botao1.setOnClickListener{
            Toast.makeText( this@MainActivity,
                "Apertei o login", Toast.LENGTH_LONG).show();
        }
        }
    }


