/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller18;

/**
 *
 * @author administrador
 */
public class Operaciones {

    public static double dividir(double a, double b) throws MisExcepciones  {
        if (a < 0) {
            throw new MisExcepciones("El argumento a no puede ser negativo");
        }
        if (b < 0) {
            throw new MisExcepciones("El argumento b no puede ser negativo");
        }
        if (b == 0) {
            throw new MisExcepciones("El argumento b no puede ser 0");
        }
        return a / b;
    }
}
