package com.daw.jp.genioquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class TelaFinal extends AppCompatActivity {

    Button btn;
    ImageView img;
    TextView frase;
    TextView pontu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_final);

        img = findViewById(R.id.imag_resu);
        btn = findViewById(R.id.btn_final);
        frase = findViewById(R.id.txt_frase);
        pontu = findViewById(R.id.txt_pontuacao);



        int pontuacao = getIntent().getIntExtra("pontuacao", -1);
        pontu.setText("Pontuação: " + pontuacao);

        if (pontuacao <= 40 ){
            Glide.with(getApplicationContext())
                    .load(R.drawable.seya)
                    .into(img);
            frase.setText("O seu baixo nivel de conhecimento causou até lagrimas no Seya!");
        } else if (pontuacao <= 70){
            Glide.with(getApplicationContext())
                    .load(R.drawable.rock)
                    .into(img);
            frase.setText("Rock Lee reconhece seu esforço!");
        } else if (pontuacao <= 95){
            Glide.with(getApplicationContext())
                    .load(R.drawable.luffy)
                    .into(img);
            frase.setText("Luffy está maravilhado com seus conhecimentos!");
        } else if (pontuacao == 100){
            Glide.with(getApplicationContext())
                    .load(R.drawable.goku)
                    .into(img);
            frase.setText("O seu conhecimento está no nivel do poder de Goku!");
        }


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finishAffinity();
                Intent it = new Intent(v.getContext(), MainActivity.class);
                startActivity(it);
            }
        });
    }
}