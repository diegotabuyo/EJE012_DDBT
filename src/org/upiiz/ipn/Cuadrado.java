package org.upiiz.ipn;

public class Cuadrado extends Figura {
    private int x, y;
    private double lado;

    public Cuadrado(int x, int y, double lado, String color, int anchoLinea, boolean relleno) {
        super(color, anchoLinea, relleno);
        this.x = x;
        this.y = y;
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("------------------------------");
        System.out.println("Dibujando figura\n");
        System.out.println("Tipo: Cuadrado\n");
        System.out.println("Coordenadas: origen x=" + x + ", y=" + y + ", lado=" + lado + "\n");
        System.out.println("Color: " + color + "\n");
        System.out.println("Ancho linea: " + anchoLinea + "px\n");
        System.out.println("Relleno: " + getRellenoString() + "\n");
    }
}