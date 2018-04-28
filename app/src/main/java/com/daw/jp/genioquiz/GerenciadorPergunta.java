package com.daw.jp.genioquiz;

import java.util.ArrayList;
import java.util.Random;

public class GerenciadorPergunta {
    private ArrayList<Pergunta> perguntas;
    private Pergunta atual;

    public GerenciadorPergunta() {
        perguntas = new ArrayList<>();
        ArrayList<Boolean> valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são Pecados?", "Meliodas", "Zeldris", "Diane", "Hawk", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são Mandamentos?", "Ban", "Grayroad", "Estarossa", "Fraudrin", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são Tesouros Sagrados?", "Chastiefol", "King", "Aranak", "Rhitta", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são membro do Clã dos Gigantes?", "Gloxinia", "Drole", "Gowther", "Gideon", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são membro do Clã das Fadas?", "Elaine", "Gideon", "Gloxinia", "Galand", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Boku No Hero) Qual desses são alunos da U.A?", "Midoriya", "Aizawa", "Shigaraki", "Bakugo", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Boku No Hero) Quais individualidades o Nomu que enfrenta All Might possui?", "Teletransposte", "Regeneração", "Absorvição de impacto", "Gelo e Fogo", valores));

    }

    public Pergunta novaPergunta(){
        int local = new Random().nextInt(perguntas.size());
        this.atual = perguntas.remove(local);
        return this.atual;
    }

    public int verificarResposta(boolean r1, boolean r2, boolean r3, boolean r4){
        int cont = 0;
        if (atual.getCorretas().get(0).equals(r1)){
            cont += 5;
        }
        if (atual.getCorretas().get(1).equals(r2)){
            cont += 5;
        }
        if (atual.getCorretas().get(2).equals(r3)){
            cont += 5;
        }
        if (atual.getCorretas().get(3).equals(r4)){
            cont += 5;
        }
        return cont;
    }
}
