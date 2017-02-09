/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rcisnerosg.t002;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class SPP2RCisnerosGT002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sue;
        int he, cate;
        sue = SueldoBasico ();
        he = HorasExtra ();
        cate = CategoriaTrabajador(he,sue);
    }
    
   static double SueldoBasico (){
       double sueld;
       System.out.println("Cuanto es tu sueldo:");
       Scanner T = new Scanner (System.in);
       sueld = T.nextDouble ();
       return sueld;
   } 
   static int CategoriaTrabajador (double he, double sue){
       double pago;
       int categor;
       System.out.println("Que categoria de trabajador eres:");
       Scanner T = new Scanner (System.in);
       categor = T.nextInt ();
       if (categor >= 1 && categor <= 8){
           switch (categor){
               case 1: 
                   pago = (30 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 2:
                   pago = (38 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 3:
                   pago = (50 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 4:
                   pago = (70 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 5: 
                   pago = (90 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 6:
                   pago = (110 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 7:
                   pago = (130 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
               case 8:
                   pago = (150 * he) + sue;
                   System.out.println("Tu sueldo es: " + pago + " MXN");
                   break;
           }
       }
       else {
           System.out.println("El numero no esta en el rango");
        }
       return categor;
}
   static int HorasExtra (){
       int Horase;
       System.out.println("Cuantas horas extra trabajaste:");
       Scanner T = new Scanner (System.in);
       Horase = T.nextInt ();
       return Horase;
}

    
}
