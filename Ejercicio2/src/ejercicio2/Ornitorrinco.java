/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author tizzi
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

