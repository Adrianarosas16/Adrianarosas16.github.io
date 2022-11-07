package Parcial1.Tarea4;

public class Fibonacci {
    public static void main(String args[]){
        int i = 0, a = 0, b = 1, c = 0;

        System.out.println("Serie con for: ");
        for(i = 0; i < 11; i++){
            if(i < 10){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
    }
}
    

