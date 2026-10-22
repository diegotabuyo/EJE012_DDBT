package org.upiiz.ipn;

public class Plumon {
    private String color;
    private int grosor;

    public Plumon(String color, int grosor) {
        this.color = color;
        this.grosor = grosor;
    }

    public void pintar() {
        System.out.println("Usando plumón color " + color + " con grosor " + grosor + "px.");
    }

    public String getColor() { return color; }
    public int getGrosor() { return grosor; }
}