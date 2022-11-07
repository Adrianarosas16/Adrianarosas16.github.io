package Parcial1.Tarea4;

import java.util.Scanner;

public class Calculopi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Cuantos términos de presision desea: ");
            int n = sc.nextInt();

            System.out.println("pi = " + pi(n));
        sc.close();
    }

    public static double pi(int n){
        int d = 1, sig = 1;
        double t, s = 0;

        for(int i = 1; i <= n; i++){
            t = (double) 1 / d * sig;
            s += t;
            d += 2;
            sig *=  -1;
        }
        return s *  4;
    }
}
    

