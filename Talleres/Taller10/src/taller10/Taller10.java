/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10;

/**
 *
 * @author administrador
 */
public class Taller10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] texto = new String[5];
        for(int i=0; i<texto.length; i++){
            //System.out.println(texto[i]);
        }
        
        int [] pares = new int [5];
        pares[0]= 120;
        pares[1]= 150;
        pares[2]= 90;
        pares[3]= 80;
        pares[4]= 70;
        
        for(int i=0; i<pares.length; i++){
            //System.out.println(pares[i]);
        }
        
        
        Persona[] lista = { new Persona(), new Persona(), new Persona(), 
            new Persona(), new Persona()};
        
        for(int i=0; i<lista.length; i++){
            //System.out.println(lista[i]);
        }
        
        
        lista[0] = new Persona();
        lista[0].setNombre("Jhonny");
        lista[0].setApellido("Cash");
        lista[0].setEdad(22);
        lista[0].setDocumento("102030");
        lista[1] = new Persona();
        lista[1].setNombre("Jhonny");
        lista[1].setApellido("Bravo");
        lista[1].setEdad(33);
        lista[1].setDocumento("112233");
        lista[2] = new Persona();
        lista[2].setNombre("Timothy");
        lista[2].setApellido("Leary");
        lista[2].setEdad(33);
        lista[2].setDocumento("ISDEAD");
        
       for(int i=0; i<lista.length; i++){
            lista[i].imprimir();
        }
    }
}
