package com.lorenzonosotti;

import java.util.Comparator;

public class Auto implements Comparator<Auto>{
    private String targa;
    private int velocita;

    public Auto(String targa, int velocita) {
        this.targa=targa;
        this.velocita=velocita;
    }

    public Auto() {
    }

    public static Auto getInstance() {
        return new Auto();
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int compare(Auto o1, Auto o2) {
        if(o1.getVelocita()>o2.getVelocita())
            return 1;
        else if(o1.getVelocita()<o2.getVelocita())
            return -1;        
        return 0;
    }

}
