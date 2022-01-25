//Aritmeticke opracije1. Aritmeticke opracije
// Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima
// zbir, razliku, proizvod, kolicnik i ostatak deljenja prvog broja drugim tim redom.

import java.util.InputMismatchException;
import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args) {

        // Korisnik unosi prvi broj
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");

        //Stavljam try catch block za Exeptione: deljenje sa 0, kucanje vrednosti koje nisu numericke
        try{
        int prviBroj = sc.nextInt();

        //Korisnik unosi drugi broj
        System.out.print("Unesite drugi broj: ");
        int drugiBroj = sc.nextInt();

        //Mogla sam rezultat i direktno da stavim u ispis, ali vezbam ovako, u slucaju da mi mozda jos negde
        //zatreba ista promenljiva
        int zbir = prviBroj + drugiBroj;
        System.out.println(prviBroj + " + " + drugiBroj + " = " + (zbir));
        int razlika = prviBroj - drugiBroj;
        System.out.println(prviBroj + " - " + drugiBroj + " = " + (razlika));
        int proizvod = prviBroj * drugiBroj;
        System.out.println(prviBroj + " * " + drugiBroj + " = " + (proizvod));

        //Kod deljenja, delilac ne moze da bude 0
        //posto koristim double, nece to prikazati kao ArithmeticExepcion pa stavljam uslov
        if(drugiBroj==0) {
            System.out.println("izvinite, za operaciju deljenje, delilac ne moze biti 0");

        }
        else {
            double kolicnik = Double.valueOf(prviBroj) / drugiBroj;
            System.out.println(prviBroj + " / " + drugiBroj + " = " + (kolicnik));
        }

           int moduo = prviBroj % drugiBroj;
           System.out.println(prviBroj + " % " + drugiBroj + " = " + (moduo));
        }

        //Ovde hvatam Exception ukoliko ih je bilo
        //Ovaj je za deljenje sa 0
        catch (ArithmeticException e) {
            System.out.println("Izvinite, za operaciju moduo, delilac ne moze biti 0");
        }

        //Ovaj ako korisnik unese neodgovarajuci tip poadtka
        catch (InputMismatchException e) {

            System.out.println("Izinite, morati uneti celobrojnu vrednost");
        }


        }
    }
