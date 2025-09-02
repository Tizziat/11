
package ejercicio2;

/**
 *
 * @author Juanjo
 */
public class Ornitorrinco extends PapaCastor {
    private String colorPanza;
    private String propulsion;

    public Ornitorrinco(String colorPanza, String propulsion) {
        this.colorPanza = colorPanza;
        this.propulsion = propulsion;
    }

    public String getColorPanza() {
        return colorPanza;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void gritoDeGuerra() {
        System.out.println("cuca cuca...");
    }
}

