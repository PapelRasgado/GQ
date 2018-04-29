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
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros do Zodiaco) Qual desses são Cavaleiros de Ouro?", "Shaka", "Shun", "Orpheu", "Aldebaran", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros do Zodiaco) Qual dos Cavaleiros de Bronze era a reencarnação do deus Hades na Saga do Inferno?", "Seiya", "Ikki", "Shion", "Shun", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(false);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Caveleiros do Zodiaco) Na mangá Episodio G que conta a historia dos Caveleiros de Ouro, quais desses golpes pertencem a Aiolia de Leão?", "Colera do Dragãpo", "Meteoro de Pegasus", "Relampago de Plasma", "Photon Burst", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Caveleiros do Zodiaco) Na Saga do Inferno quais são os deuses do sono e da morte que auxiliam Hades?", "Thanatos", "Morpheus", "Hypnos", "Lucifer", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Sword Art Online) Qual as espadas usada por Kirito?", "Excalibur", "Hasagi", "Elucidator", "Dark Repulser", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros Do Zodiaco) Qual o Cavaleiro de Ouro que recebeu a benção do Misopotâmenos (Benção dada pelos deuses e retarda o envelhecimento)?", "Dohko de Libra", "Shura de Capricornio", "Aldebaran de Touro", "Shaka de Virgem", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros Do Zodiaco) Qual o Cavaleiro de Ouro que representa 'O pacifico carneiro que cavalga entre as estrelas' e possui poderes psiquicos?", "Aioros de Sagitario", "Mú de Aries", "Saga de Gêmeos", "Manigold de Cancer", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros Do Zodiaco) Quais dessses golpes pertencem a Seiya de Pegasus?", "Corrente de Andromeda", "Meteoro de Pégaso", "Turbilhão de Pégaso", "Execução Aurora", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros Do Zodiaco) Quantas armaduras do Santuario (Bronze, Prata e Ouro) provem de constelações oficiais no anime e no mangá??", "17", "88", "99", "124", valores));

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
