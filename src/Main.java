import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */
        Scanner scan = new Scanner(System.in);
        System.out.print("podaj wiek: ");
        int wiek = scan.nextInt();

        int modulo = wiek%3;

        if (modulo == 0){
            System.out.print("podzielny przez 3");
        }else{
            System.out.print("Niepodzielny przez 3");
        }


        System.out.print("\npodaj nr indexu: ");
        int index = scan.nextInt();

        boolean wynik = (index % 2 == 0) ? true : false;


        if(wynik){
            System.out.print("Podzielny przez 2");
        }else{
            System.out.print("Niepodzielny przez 2");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.print("\npodaj liczbe z przcinkiem: ");
        float zmienna = scan.nextFloat();
        /* mialo być else if() */
        if(zmienna < 1 && zmienna > -1){
            System.out.print("mozna to latwo na procent zamienic...");
        }else{
            System.out.print("zamiana na procent wymaga pewnych zalozen...");
        }


    }
}
