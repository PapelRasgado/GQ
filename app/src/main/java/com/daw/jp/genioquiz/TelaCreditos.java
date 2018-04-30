package com.daw.jp.genioquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class TelaCreditos extends AppCompatActivity {

    private ImageView gif_arthur;
    private ImageView gif_jp;
    private ImageView gif_jon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_creditos);
        gif_arthur = findViewById(R.id.imageView4);
        gif_jon = findViewById(R.id.imageView6);
        gif_jp = findViewById(R.id.imageView7);
        Glide.with(getApplicationContext()).load(R.drawable.gata1).into(gif_arthur);
        Glide.with(getApplicationContext()).load(R.drawable.muppet).into(gif_jon);
        Glide.with(getApplicationContext()).load(R.drawable.seya).into(gif_jp);
    }
}
