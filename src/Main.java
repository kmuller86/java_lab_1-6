import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imie :");
        String imie = scan.next();
        System.out.print("Podaj nazwisko :");
        String nazwisko = scan.next();
        System.out.print("Podaj wiek :");
        int wiek = scan.nextInt();
        System.out.print("Podaj nr indexu :");
        int index = scan.nextInt();



        System.out.println("Podane dane to : ");
        System.out.println( "Imie i nazwisko: " + imie + " " + nazwisko );
        System.out.println( "masz " + wiek + " staruszku " );
        System.out.println( "a twoj nr indexu to  " + index  );


        System.out.println( "\n fun fakt za " + (100 - wiek) + " bedziesz mial 100 lat."  );


        System.out.println(" fun fakt 2: \n twoj nr indexu razy twoj wiek to: " + wiek * index  );

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

    }
}
