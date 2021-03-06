package com.daw.jp.genioquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btn;
    ImageButton btnCreditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_comecar);
        btnCreditos = findViewById(R.id.btn_creditos);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent it = new Intent(v.getContext(), TelaPergunta.class);
                startActivity(it);
            }
        });
        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(v.getContext(), TelaCreditos.class);
                startActivity(it1);
            }
        });
    }

    @Override
    public void onBackPressed(){
        System.exit(0);
    }
}
