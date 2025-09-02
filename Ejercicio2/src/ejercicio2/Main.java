
package ejercicio2;

/**
 *
 * @author tizzi
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ornitorrinco> lista = new ArrayList<>();

        
        lista.add(new Ornitorrinco("VERDE", "Alta"));
        lista.add(new Ornitorrinco("VERDE", "Media"));
        lista.add(new Ornitorrinco("VERDE", "Baja"));
        lista.add(new Ornitorrinco("VERDE", "Alta"));

        
        lista.add(new Ornitorrinco("BLUE", "Media"));
        lista.add(new Ornitorrinco("blu", "Alta"));

        
        System.out.println("Listado completo:");
        for (Ornitorrinco o : lista) {
            System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
        }

       
        System.out.println("\nOrnitorrincos que tocan la guitarra:");
        for (Ornitorrinco o : lista) {
            o.tocarGuitarra();
        }

        
        System.out.println("\nOrnitorrincos con habilidad propulsion:");
        for (Ornitorrinco o : lista) {
            System.out.println("- Propulsion: " + o.getPropulsion());
        }

        
        System.out.println("\nOrnitorrincos con propulsion y que tocan guitarra:");
        for (Ornitorrinco o : lista) {
            System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
            o.tocarGuitarra();
        }

        
        System.out.println("\nOrnitorrincos con propulsion, guitarra y panza azul:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
            }
        }

        
        System.out.println("\nListado de Omniverde:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("VERDE")) {
                System.out.println("- Omniverde: Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
                o.gritoDeGuerra();
            }
        }

        
        System.out.println("\nPanza azul y tocan guitarra:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                o.tocarGuitarra();
            }
        }

        
        System.out.println("\nPanza azul y tienen propulsion:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Propulsion: " + o.getPropulsion());
            }
        }

        
        System.out.println("\nPanza azul + propulsion + guitarra:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
            }
        }

        
        System.out.println("\nPanza azul + propulsion + guitarra + panza azul:");
        for (Ornitorrinco o : lista) {
            if (o.getColorPanza().equalsIgnoreCase("BLUE") || o.getColorPanza().equalsIgnoreCase("blu")) {
                System.out.println("- Panza: " + o.getColorPanza() + ", Propulsion: " + o.getPropulsion());
                o.tocarGuitarra();
            }
        }

        
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
