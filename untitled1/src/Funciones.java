package Funciones;
import java.util.Scanner;

public class Funciones {
    public static void main(String[]arg){
        Scanner valores = new Scanner(System.in);

        System.out.println("10");
        int n = valores.nextInt();
        System.out.println("2");
        int divisor = valores.nextInt();

        boolean esDivisible = esDivisible(n, divisor);
        System.out.println("el resultado es: " + esDivisible);
    }

    public static boolean esDivisible(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
}
