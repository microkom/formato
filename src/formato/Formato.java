/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formato;

/**
 *
 * @author german
 */
public class Formato {
    public static void line(int cant, String caracter) {
        String hyphen = "";
        for (int i = 0; i < cant; i++) {
            hyphen += caracter;
        }
        System.out.println("\t"+hyphen);
    }
}
