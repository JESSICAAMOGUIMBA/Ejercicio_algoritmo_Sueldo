
package ejercicio_algoritmos_sueldo;

import java.util.Scanner;

public class Ejercicio_Algoritmos_Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
    float suma=0, horasT;
    float precioHoras=(float) 3.5;
    char cont;
    Scanner horas = new Scanner(System.in);
    System.out.println("");
    System.out.println("\t Empresa la Universal ");
    for (cont=0;cont<5;cont++){
      System.out.println("Ingrese el Numero de horas trabajadas en el día:");
      horasT=horas.nextFloat();
      suma=suma+horasT;

    }
     System.out.println("El resultado de Horas trabajadas es: "+suma);
     System.out.println("El sueldo a recibir es: $  "+suma*precioHoras);
        
        
        
        
    }
    
}
