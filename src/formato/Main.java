/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formato;

import static formato.Formato.line;

/**
 *
 * @author german
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String registro = "REGISTRO DE CATEGORIAS ";
        String datos = "Datos";
        int longitudTitulo = 50;
        int longitudDatos = 20;
        int ancho = 73;
        String leftAlignFormat = "\t"
                + "|"
                + " %-" + Integer.toString(longitudTitulo - 1) + "s"
                + "|"
                + " %-" + Integer.toString(longitudDatos - 1) + "s"
                + "|";

        line(ancho, "-");
        System.out.println(String.format(leftAlignFormat, registro, datos));
        line(ancho, "-");
        System.out.println((char) 64);
//741-745
    }

}
