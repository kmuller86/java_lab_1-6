import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z
        Scanner scan = new Scanner(System.in);
        System.out.println("tekst1");
        System.out.print("podaj liczbe: ");
        int liczba = scan.nextInt();

        System.out.println("twoja liczba to : " + liczba);

    }
}
