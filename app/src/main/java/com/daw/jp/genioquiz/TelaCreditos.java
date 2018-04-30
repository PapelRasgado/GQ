package com.daw.jp.genioquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        gif_arthur = findViewById(R.id.img_arthur);
        gif_jon = findViewById(R.id.img_janta);
        gif_jp = findViewById(R.id.img_jp);
        Glide.with(getApplicationContext()).load(R.drawable.gata1).into(gif_arthur);
        Glide.with(getApplicationContext()).load(R.drawable.muppet).into(gif_jon);
        Glide.with(getApplicationContext()).load(R.drawable.caxorro).into(gif_jp);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finishAffinity();
                Intent it = new Intent(this, MainActivity.class);
                startActivity(it);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
