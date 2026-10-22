package org.upiiz.ipn;
import java.util.List;

public class Poligono extends Figura {
    private int cantidadLados;
    private List<Punto> vertices; // Composición con la clase Punto

    public Poligono(int cantidadLados, List<Punto> vertices, String color, int anchoLinea, boolean relleno) {
        super(color, anchoLinea, relleno);
        this.cantidadLados = cantidadLados;
        this.vertices = vertices;
    }

    @Override
    public void dibujar() {
        System.out.println("------------------------------");
        System.out.println("Dibujando figura\n");
        System.out.println("Tipo: Poligono de " + cantidadLados + " lados\n");
        System.out.print("Coordenadas (Vértices): ");
        for (Punto p : vertices) {
            System.out.print(p.toString() + " ");
        }
        System.out.println("\n\nColor: " + color + "\n");
        System.out.println("Ancho linea: " + anchoLinea + "px\n");
        System.out.println("Relleno: " + getRellenoString() + "\n");
    }
}