/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author melan
 */
public class EVA1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String curp;
        int edad;
        double prom;
        
        //Crear nuestro Scanner
        
        Scanner cap;
        cap=new Scanner(System.in);
        
        //Captura
        System.out.println("Nombre completo");
        nombre=cap.nextLine();
        System.out.println("Captura curp");
        curp=cap.nextLine();
        System.out.println("Captura edad");
        edad=cap.nextInt();
        System.out.println("Captura el prom");
        prom=cap.nextDouble();
        
        //Impresion:
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(prom);
    }
    
}
