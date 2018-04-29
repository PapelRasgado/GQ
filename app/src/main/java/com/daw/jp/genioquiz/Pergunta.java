package com.daw.jp.genioquiz;

import java.util.ArrayList;

public class Pergunta {
    private String pergunta;
    private String alt1;
    private String alt2;
    private String alt3;
    private String alt4;
    private ArrayList<Boolean> corretas;

    public Pergunta(String pergunta, String alt1, String alt2, String alt3, String alt4, ArrayList<Boolean> corretas) {
        this.pergunta = pergunta;
        this.alt1 = alt1;
        this.alt2 = alt2;
        this.alt3 = alt3;
        this.alt4 = alt4;
        this.corretas = corretas;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getAlt1() {
        return alt1;
    }

    public void setAlt1(String alt1) {
        this.alt1 = alt1;
    }

    public String getAlt2() {
        return alt2;
    }

    public void setAlt2(String alt2) {
        this.alt2 = alt2;
    }

    public String getAlt3() {
        return alt3;
    }

    public void setAlt3(String alt3) {
        this.alt3 = alt3;
    }

    public String getAlt4() {
        return alt4;
    }

    public void setAlt4(String alt4) {
        this.alt4 = alt4;
    }

    public ArrayList<Boolean> getCorretas() {
        return corretas;
    }

    public void setCorretas(ArrayList<Boolean> corretas) {
        this.corretas = corretas;
    }
}
