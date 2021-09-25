import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        boolean troll = true;
        boolean troll2;

        if(troll == true){
            troll2 = true;
        }else{
            troll2 = false;
        }

        if(troll2 == false){
            System.out.println("ta wiadomosc sie nie wyswietli");
            troll2 = !troll2;
        }else{
            System.out.println("brawo powyzszy kod jest super! tak wlasnie powinno sie pisac!");

        }

        if(troll || troll2){
            System.out.println("troll2 nie ma znaczenia");
        }else{
            System.out.println("bla bla bla");

        }

        if(!!troll){
            System.out.println("podwojne negacje zwiekszaja czytelnosc");
        }


    }
}
