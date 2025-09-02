/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author tizzi
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ornitorrinco> lista = new ArrayList<>();

        // Crear 4 verdes
        lista.add(new Ornitorrinco("VERDE", "Alta"));
        lista.add(new Ornitorrinco("VERDE", "Media"));
        lista.add(new Ornitorrinco("VERDE", "Baja"));
        lista.add(new Ornitorrinco("VERDE", "Alta"));

        // Crear 2 azules
        lista.add(new Ornitorrinco("BLUE", "Media"));
        lista.add(new Ornitorrinco("blu", "Alta"));

        // Mostrar listado completo
        System.out.println("Listado completo:");
        for (Ornitorrinco o : lista) {
            System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
        }

        // Mostrar los que tocan guitarra
        System.out.println("\nOrnitorrincos que tocan la guitarra:");
        for (Ornitorrinco o : lista) {
            o.tocarGuitarra();
        }

        // Mostrar los que tienen propulsion
        System.out.println("\nOrnitorrincos con habilidad propulsion:");
        for (Ornitorrinco o : lista) {
            System.out.println("- Propulsion: " + o.getPropulsion());
        }

        // Propulsion + guitarra
        System.out.println("\nOrnitorrincos con propulsion y que tocan guitarra:");
        for (Ornitorrinco o : lista) {
            System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
            o.tocarGuitarra();
        }

        // Propulsion + guitarra + panza azul
        System.out.println("\nOrnitorrincos con propulsion, guitarra y panza azul:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
            }
        }

        // Omniverde: verde con todas las habilidades
        System.out.println("\nListado de Omniverde:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("VERDE")) {
                System.out.println("- Omniverde: Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
                o.gritoDeGuerra();
            }
        }

        // Panza azul + guitarra
        System.out.println("\nPanza azul y tocan guitarra:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                o.tocarGuitarra();
            }
        }

        // Panza azul + propulsion
        System.out.println("\nPanza azul y tienen propulsion:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Propulsion: " + o.getPropulsion());
            }
        }

        // Panza azul + propulsion + guitarra
        System.out.println("\nPanza azul + propulsion + guitarra:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
            }
        }

        // Panza azul + propulsion + guitarra + panza azul (repetido)
        System.out.println("\nPanza azul + propulsion + guitarra + panza azul:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
            }
        }

        // Omniverde final
        System.out.println("\nListado final de Omniverde:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("VERDE")) {
                System.out.println("- Omniverde: Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
                o.gritoDeGuerra();
            }
        }
    }
}
