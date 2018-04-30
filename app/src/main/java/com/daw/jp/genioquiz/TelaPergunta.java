package com.daw.jp.genioquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class TelaPergunta extends AppCompatActivity {
    private int cont = 1;
    private int pontos = 0;
    private Pergunta atual;
    private GerenciadorPergunta gp;

    private TextView titulo;
    private TextView pergunta;
    private CheckBox a1;
    private CheckBox a2;
    private CheckBox a3;
    private CheckBox a4;
    private ImageView logo;
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
        logo = findViewById(R.id.img_anime);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                terminarPergunta();
            }
        });

        comecarPergunta();
    }


    private void comecarPergunta() {
        atual = gp.novaPergunta();
        titulo.setText("Pergunta " + cont);
        pergunta.setText(atual.getPergunta());
        a1.setText(atual.getAlt1());
        a1.setChecked(false);
        a2.setText(atual.getAlt2());
        a2.setChecked(false);
        a3.setText(atual.getAlt3());
        a3.setChecked(false);
        a4.setText(atual.getAlt4());
        a4.setChecked(false);
        switch (atual.getAnime()){
            case 0:
                Glide.with(getApplicationContext())
                        .load(R.drawable.nanatsu)
                        .into(logo);
                break;
            case 1:
                Glide.with(getApplicationContext())
                        .load(R.drawable.boku)
                        .into(logo);
                break;
            case 2:
                Glide.with(getApplicationContext())
                        .load(R.drawable.cdz)
                        .into(logo);
                break;
            case 3:
                Glide.with(getApplicationContext())
                        .load(R.drawable.sao)
                        .into(logo);
                break;
            case 4:
                Glide.with(getApplicationContext())
                        .load(R.drawable.fullmetal)
                        .into(logo);
                break;
            case 5:
                Glide.with(getApplicationContext())
                        .load(R.drawable.naruto)
                        .into(logo);
                break;
        }
    }

    private void terminarPergunta() {

        LayoutInflater inflater = TelaPergunta.this.getLayoutInflater();
        View conView = inflater.inflate(R.layout.layout_resultado, null);

        TextView pont1 = conView.findViewById(R.id.txt_pont1);
        TextView pont2 = conView.findViewById(R.id.txt_pont2);
        TextView pont3 = conView.findViewById(R.id.txt_pont3);
        TextView pont4 = conView.findViewById(R.id.txt_pont4);
        int valor = gp.verificarResposta(a1.isChecked(), pont1, a2.isChecked(), pont2, a3.isChecked(), pont3, a4.isChecked(), pont4);
        pontos += valor;


        TextView usu1 = conView.findViewById(R.id.txt_resu_color1);
        mudaCor(usu1, a1.isChecked());

        TextView usu2 = conView.findViewById(R.id.txt_resu_color2);
        mudaCor(usu2, a2.isChecked());

        TextView usu3 = conView.findViewById(R.id.txt_resu_color3);
        mudaCor(usu3, a3.isChecked());

        TextView usu4 = conView.findViewById(R.id.txt_resu_color4);
        mudaCor(usu4, a4.isChecked());


        TextView resp1 = conView.findViewById(R.id.txt_resu_resp1);
        mudaCor(resp1, atual.getCorretas().get(0), atual.getAlt1());

        TextView resp2 = conView.findViewById(R.id.txt_resu_resp2);
        mudaCor(resp2, atual.getCorretas().get(1), atual.getAlt2());

        TextView resp3 = conView.findViewById(R.id.txt_resu_resp3);
        mudaCor(resp3, atual.getCorretas().get(2), atual.getAlt3());

        TextView resp4 = conView.findViewById(R.id.txt_resu_resp4);
        mudaCor(resp4, atual.getCorretas().get(3), atual.getAlt4());

        TextView txt = conView.findViewById(R.id.txt_resu_resu);
        txt.setText("Resultado: " + valor);

        new AlertDialog.Builder(TelaPergunta.this)
                .setView(conView)
                .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if (cont <= 5) {
                            comecarPergunta();
                        } else {
                            Intent it = new Intent(TelaPergunta.this, TelaFinal.class);
                            it.putExtra("pontuacao", pontos);
                            startActivity(it);
                        }

                    }
                })
                .show();
        cont++;
    }

    private void mudaCor(TextView txt, boolean teste, String texto) {
        if (teste) {
            txt.setBackgroundResource(R.color.green);
            txt.setText(texto);
        } else {
            txt.setBackgroundResource(R.color.red);
            txt.setText(texto);
        }
    }

    private void mudaCor(TextView txt, boolean teste) {
        if (teste) {
            txt.setBackgroundResource(R.color.green);
        } else {
            txt.setBackgroundResource(R.color.red);
        }
    }
}