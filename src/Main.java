package org.upiiz.ipn;
import java.util.Arrays;

//Diego Daniel Becerra Tabuyo 3IM1

public class Main {
    public static void main(String[] args) {
        // 1. Crear el lienzo
        Canvas miLienzo = new Canvas("Blanco", 800, 600);

        // 2. Crear las figuras con los datos exactos del requerimiento
        Linea linea = new Linea(20, 40, 30, 60, "Rojo", 1, false);
        Circulo circulo = new Circulo(30, 45, 5.0, "Verde", 2, true);
        Cuadrado cuadrado = new Cuadrado(10, 10, 15.0, "Azul", 1, true);

        // Poligono usando composicion de Puntos
        Poligono poligono = new Poligono(3, Arrays.asList(new Punto(0,0), new Punto(10,0), new Punto(5,10)), "Amarillo", 3, false);

        // 3. Agregar las figuras al lienzo (Agregación)
        miLienzo.agregarFigura(linea);
        miLienzo.agregarFigura(circulo);
        miLienzo.agregarFigura(cuadrado);
        miLienzo.agregarFigura(poligono);

        // 4. Crear un plumon (Asociacion) y dibujar tod
        Plumon marcadorRojo = new Plumon("Rojo", 2);

        // Polimorfismo en acción
        miLienzo.dibujarTodas(marcadorRojo);
    }
}