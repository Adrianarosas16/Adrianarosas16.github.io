package Parcial1.Tarea4;

import java.util.Scanner;

public class Factorial {
        /**
         * @param args
         */
        public static void main(String[] args) 
        {
            Scanner numero = new Scanner( System.in );
                double factorial;
                double n;
    
                System.out.print("Introduce un número: ");
                n=numero.nextInt();
                factorial=1;
    
                for (double i = n; i > 0; i-- ){
                 factorial = factorial * i;
                }
    
                System.out.println("El factorial de " + n + " es: " + factorial);
            
    numero.close ();
        
    }
}
    

