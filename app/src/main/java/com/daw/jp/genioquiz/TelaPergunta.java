package com.daw.jp.genioquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
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
    }

    private void terminarPergunta() {
        int valor = gp.verificarResposta(a1.isChecked(), a2.isChecked(), a3.isChecked(), a4.isChecked());
        pontos += valor;


        LayoutInflater inflater = TelaPergunta.this.getLayoutInflater();
        View conView = inflater.inflate(R.layout.layout_resultado, null);
        TextView usu1 = conView.findViewById(R.id.txt_resu_color1);
        mudaCor(usu1, a1.isChecked());

        TextView usu2 = conView.findViewById(R.id.txt_resu_color2);
        mudaCor(usu2, a2.isChecked());

        TextView usu3 = conView.findViewById(R.id.txt_resu_color3);
        mudaCor(usu3, a3.isChecked());

        TextView usu4 = conView.findViewById(R.id.txt_resu_color4);
        mudaCor(usu4, a4.isChecked());

        TextView resp1 = conView.findViewById(R.id.txt_resu_resp1);
        resp1.setText(atual.getAlt1());
        mudaCor(resp1, atual.getCorretas().get(0));

        TextView resp2 = conView.findViewById(R.id.txt_resu_resp2);
        resp2.setText(atual.getAlt2());
        mudaCor(resp2, atual.getCorretas().get(1));

        TextView resp3 = conView.findViewById(R.id.txt_resu_resp3);
        resp3.setText(atual.getAlt3());
        mudaCor(resp3, atual.getCorretas().get(2));

        TextView resp4 = conView.findViewById(R.id.txt_resu_resp4);
        resp4.setText(atual.getAlt4());
        mudaCor(resp4, atual.getCorretas().get(3));

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

    private void mudaCor(TextView txt, boolean teste) {
        if (teste) {
            txt.setBackgroundResource(R.color.green);
        } else {
            txt.setBackgroundResource(R.color.red);
        }
    }
}