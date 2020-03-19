package com.example.frasesdecoach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFrase.setOnClickListener(View.OnClickListener {
            clickBotao(btnFrase);
        })
    }

    fun clickBotao(view: View){
        val frases = resources.getTextArray(R.array.frases);

        var sortear = Random.nextInt(0, frases.size -1);

        Log.i("Botao", "Mensagem $sortear");

        txtFrase.text = frases[sortear];
        val fraseSelecionada = frases[sortear];

        Log.i("Botao", "Mensagem $fraseSelecionada");


    }
}
