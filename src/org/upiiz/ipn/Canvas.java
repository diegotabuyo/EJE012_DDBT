package org.upiiz.ipn;
import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private String colorFondo;
    private int ancho;
    private int alto;
    private List<Figura> figuras; // Agregación de figuras

    public Canvas(String colorFondo, int ancho, int alto) {
        this.colorFondo = colorFondo;
        this.ancho = ancho;
        this.alto = alto;
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    // Asociacion con Plumon (se pasa como parámetro temporal, no como atributo de la clase)
    public void dibujarTodas(Plumon p) {
        System.out.println("\nIniciando dibujo en Canvas (" + ancho + "x" + alto + ", fondo " + colorFondo + ")");
        p.pintar();

        for (Figura figura : figuras) {
            figura.dibujar();
        }
    }
}