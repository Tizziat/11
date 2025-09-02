/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author tizzi
 */
public class PapaCastor {
    public void tocarGuitarra() {
        System.out.println("Do-Re-Mi");
        for (int i = 0; i < 3; i++) {
            int cuerda = (int)(Math.random() * 6) + 1;
            System.out.println("toca cuerda " + cuerda);
        }
        System.out.println("Fa-Sol-La-Si");
    }
}

