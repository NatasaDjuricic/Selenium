//Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
//Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr:
//5! = 5 * 4 * 3 * 2 * 1 = 120
//3! = 3 * 2 * 1 = 6

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo pozitivan broj: ");

        int n = sc.nextInt();
        int proizvod = 1;

        //Pravim petlju of broja n do 1 i svaki sledeci broj mnozim prethodnim
        for(int i = n; i>1; i--) {
            proizvod=proizvod*i;

        }
        System.out.println(n+"!"+" = "+proizvod);

    }
}
