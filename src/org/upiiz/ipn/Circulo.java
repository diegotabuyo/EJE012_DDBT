package org.upiiz.ipn;

public class Circulo extends Figura {
    private int x, y;
    private double radio;

    public Circulo(int x, int y, double radio, String color, int anchoLinea, boolean relleno) {
        super(color, anchoLinea, relleno);
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("------------------------------");
        System.out.println("Dibujando figura\n");
        System.out.println("Tipo: Circulo\n");
        System.out.println("Coordenadas: x1=" + x + ", y1=" + y + ", radio=" + radio + "\n");
        System.out.println("Color: " + color + "\n");
        System.out.println("Ancho: " + anchoLinea + "px\n");
        System.out.println("Relleno: " + getRellenoString() + "\n");
    }
}