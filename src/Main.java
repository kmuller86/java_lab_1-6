import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        
        double[] tab5 = new double[5];
        tab5[0] = 0.1;
        tab5[1] = 0.2;
        tab5[2] = 0.3;
        tab5[3] = 0.4;
        tab5[4] = 0.5;

        System.out.println("dlugosc tablicy to: " + tab5.length + " a jej wartosci to:");
        for(int i=0; i < tab5.length; i++){
            System.out.print(tab5[i] + " ");
        }

        
    }
}
