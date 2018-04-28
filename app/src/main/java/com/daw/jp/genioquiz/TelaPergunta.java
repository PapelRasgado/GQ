package com.daw.jp.genioquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Aluno on 27/04/2018.
 */

public class TelaPergunta extends AppCompatActivity {
    private int cont = 0;
    private int pontos = 0;
    private Pergunta atual;

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


    }
}