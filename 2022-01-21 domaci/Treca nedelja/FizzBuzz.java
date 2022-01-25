//2. FizzBuzz
//Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku
// "Fizz" ako je on deljiv sa 3,
// nisku "Buzz" ako je on deljiv sa 5,
// a nisku
//"FizzBuzz" ako je on deljiv i sa 3 i sa 5.

import java.util.InputMismatchException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite celi pozitivan broj: ");

        //Stavljam try catch block kako bi korisniku izlazila poruka sta je pogresno ukucano
        try {
        int n = sc.nextInt();

        if (n <=0) {
            throw new IllegalArgumentException();
        }
           for (int i = 1; i <= n; i++) {
           System.out.print(i + ":");
           if (i % 3 == 0) {
               System.out.print("Fizz");
           }
           if (i % 5 == 0) {
               System.out.print("Buzz");
           }
           System.out.println();
       }

       }

        //Ovde je uhvatio Esception koji se odnosi na nevalidan tip unosa String ili double
       catch (InputMismatchException e) {

           System.out.println("Izinite, morati uneti celobrojnu vrednost");
       }

        //Ovde sam napravila exception za unos negativnog broja
        catch (IllegalArgumentException e) {
            System.out.println("Izvinite, morate uneti pozitivan broj");
        }

    }
}
