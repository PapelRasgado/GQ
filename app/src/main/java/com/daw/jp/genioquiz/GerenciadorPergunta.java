package com.daw.jp.genioquiz;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class GerenciadorPergunta {
    private ArrayList<Pergunta> perguntas;
    private Pergunta atual;

    public GerenciadorPergunta() {
        perguntas = new ArrayList<>();
        ArrayList<Boolean> valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são Pecados?", 0, "Meliodas", "Zeldris", "Diane", "Hawk", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são Mandamentos?", 0,"Ban", "Grayroad", "Estarossa", "Fraudrin", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são Tesouros Sagrados?",0, "Chastiefol", "King", "Aranak", "Rhitta", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são membro do Clã dos Gigantes?",0, "Gloxinia", "Drole", "Gowther", "Gideon", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Nanatsu No Taizai) Qual desses são membro do Clã das Fadas?",0, "Elaine", "Gideon", "Gloxinia", "Galand", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Boku No Hero) Qual desses são alunos da U.A?",1, "Midoriya", "Aizawa", "Shigaraki", "Bakugo", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Boku No Hero) Quais individualidades o Nomu que enfrenta All Might possui?", 1, "Teletransposte", "Regeneração", "Absorvição de impacto", "Gelo e Fogo", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros do Zodiaco) Qual desses são Cavaleiros de Ouro?", 2, "Shaka", "Shun", "Orpheu", "Aldebaran", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(false);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Caveleiros do Zodiaco) Na mangá Episodio G que conta a historia dos Caveleiros de Ouro, quais desses golpes pertencem a Aiolia de Leão?", 2, "Colera do Dragãpo", "Meteoro de Pegasus", "Relampago de Plasma", "Photon Burst", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Caveleiros do Zodiaco) Na Saga do Inferno quais são os deuses do sono e da morte que auxiliam Hades?", 2, "Thanatos", "Morpheus", "Hypnos", "Lucifer", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros Do Zodiaco) Quais dessses golpes pertencem a Seiya de Pegasus?", 2, "Corrente de Andromeda", "Meteoro de Pégaso", "Turbilhão de Pégaso", "Execução Aurora", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Cavaleiros Do Zodiaco) Quantas armaduras do Santuario (Bronze, Prata e Ouro) provem de constelações oficiais no anime e no mangá?", 2, "17", "88", "99", "124", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Sword Art Online) Qual as espadas usadas por Kirito?", 3, "Excalibur", "Hasagi", "Elucidator", "Dark Repulser", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Fullmetal Alchemist Brotherhood) Depois de uma transmutação humana para reviver sua mãe, Edward perde quais partes de seu corpo?", 4, "Olhos", "Braço Direito", "Perna esquerda", "Os dois braços", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Fullmetal Alchemist Brotherhood) Quais os nomes dos personagens principais, os irmãos:", 4, "Edward Elric", "Edward Stark", "Alphonse Stark", "Alphonse Elric", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(false);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Fullmetal Alchemist Brotherhood) Os homúnculos são baseados nos: ", 4, "Dez mandamentos", "Sete pragas", "Sete monstrinhos", "Sete pecados capitais", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Fullmetal Alchemist Brotherhood) O que o Alquimista da Trama Vital, Shou Tucker criou a partir de sua filha e seu cachorro? ", 4, "Um lunpa-lunpa", "Um híbrido", "Uma quimera", "Uma chinforinfola", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Fullmetal Alchemist Brotherhood) O Alquimista das Chamas, Roy Mustang,possui seu nome baseado em: ", 4,"Helicóptero Mi-28 Mustang ", "Caça norte americano P-51 Mustang", "Caça asiático P-90 Mustang", "M1A1 Thompson Mustang", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(false);
                add(true);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Naruto) Quais ninjas estavam no comando de todo plano executado por trás da grande guerra ninja: ", 5, "Uchiha Madara", "Uchiha Obito", "Zetsu", "Orochimaru", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(true);
                add(false);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Naruto) Quais desses foram hokages:", 5, "Tobirama Senju", "Hiruzen Sarutobi", "Jiraiya Monogatari", "Kakashi Hatake", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(false);
                add(true);
                add(true);
                add(true);
            }
        };
        perguntas.add(new Pergunta("(Naruto) Quais desses personagens fazem parte do grupo Akatsuki:", 5, "Kabuto Yakushi", "Kisame Hoshigaki", "Nagato", "Zetsu", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(false);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Naruto) Quais dessas técnicas pertence a Naruto:", 5, "Rasengan", "Amaterasu", "Yasaka Magatama", "Jutsu Sarrada das Sombras", valores));
        valores = new ArrayList<Boolean>() {
            {
                add(true);
                add(true);
                add(false);
                add(false);
            }
        };
        perguntas.add(new Pergunta("(Naruto) Quais desses ninjas são Jinchuurikis:",  5,"Yugito Nii", "Utakata", "Uraraka", "Kisame Hoshigaki", valores));


    }

    public Pergunta novaPergunta() {
        int local = new Random().nextInt(perguntas.size());
        this.atual = perguntas.remove(local);
        return this.atual;
    }

    public int verificarResposta(boolean r1, TextView pont1, boolean r2, TextView pont2, boolean r3, TextView pont3, boolean r4, TextView pont4) {
        int cont = 0;
        if (atual.getCorretas().get(0).equals(r1)) {
            cont += 5;
            pont1.setText("+5");
        } else {
            cont -= 5;
            pont1.setText("-5");
        }
        if (atual.getCorretas().get(1).equals(r2)) {
            cont += 5;
            pont2.setText("+5");
        } else {
            cont -= 5;
            pont2.setText("-5");
        }
        if (atual.getCorretas().get(2).equals(r3)) {
            cont += 5;
            pont3.setText("+5");
        } else {
            cont -= 5;
            pont3.setText("-5");
        }
        if (atual.getCorretas().get(3).equals(r4)) {
            cont += 5;
            pont4.setText("+5");
        } else {
            cont -= 5;
            pont4.setText("-5");
        }
        if (cont > 0){
            return cont;
        } else {
            return 0;
        }

    }
}
