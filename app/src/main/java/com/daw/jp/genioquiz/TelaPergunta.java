package com.daw.jp.genioquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Aluno on 27/04/2018.
 */

public class TelaPergunta extends AppCompatActivity {
    private int cont = 1;
    private int pontos = 0;
    private Pergunta atual;
    private GerenciadorPergunta gp;

    private TextView titulo;
    private TextView pergunta;
    private RadioButton a1;
    private RadioButton a2;
    private RadioButton a3;
    private RadioButton a4;
    private Button enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_pergunta);

        gp = new GerenciadorPergunta();

        titulo = findViewById(R.id.txt_nome);
        pergunta = findViewById(R.id.txt_pergunta);
        a1 = findViewById(R.id.rdo1);
        a2 = findViewById(R.id.rdo2);
        a3 = findViewById(R.id.rdo3);
        a4 = findViewById(R.id.rdo4);
        enviar = findViewById(R.id.btn_send);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                terminarPergunta();
                if (cont <= 5){
                    comecarPergunta();
                } else {
                    // fazer tela de termino //////////////////////////////////////////////////////////////////////////////////////////////////
                }
            }
        });

        comecarPergunta();
    }

    private void comecarPergunta(){
        atual = gp.novaPergunta();
        titulo.setText("Pergunta " + cont);
        pergunta.setText(atual.getPergunta());
        a1.setText(atual.getAlt1());
        a2.setText(atual.getAlt2());
        a3.setText(atual.getAlt3());
        a4.setText(atual.getAlt4());
    }

    private void terminarPergunta() {
        pontos += gp.verificarResposta(a1.isChecked(), a2.isChecked(), a3.isChecked(), a4.isChecked());
        cont ++;
    }
}