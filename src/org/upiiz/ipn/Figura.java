package org.upiiz.ipn;

public abstract class Figura {
    protected String color;
    protected int anchoLinea;
    protected boolean relleno;

    public Figura(String color, int anchoLinea, boolean relleno) {
        this.color = color;
        this.anchoLinea = anchoLinea;
        this.relleno = relleno;
    }

    // Metodo abstracto que obligará a las subclases a implementar su propio dibujo
    public abstract void dibujar();

    protected String getRellenoString() {
        return relleno ? "si" : "no";
    }
}