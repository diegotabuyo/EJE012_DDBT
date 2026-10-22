package org.upiiz.ipn;

public class Linea extends Figura {
    private int x1, y1, x2, y2;

    public Linea(int x1, int y1, int x2, int y2, String color, int anchoLinea, boolean relleno) {
        super(color, anchoLinea, relleno);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void dibujar() {
        System.out.println("------------------------------");
        System.out.println("Dibujando figura\n");
        System.out.println("Tipo: Linea\n");
        System.out.println("Coordenadas: x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "\n");
        System.out.println("Color: " + color + "\n");
        System.out.println("Ancho linea: " + anchoLinea + "px\n");
        System.out.println("Relleno: " + getRellenoString() + "\n");
    }
}