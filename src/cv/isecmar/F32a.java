package cv.isecmar;

import java.util.Scanner;

public class F32a {

    public static void main(String[] args) {
        System.out.println("Alinea 2a -- A soma de todos os números pares entre 2 e 100 (inclusive).");
        int somaPares = 0;

        for (int c=0; c <= 100; c=c+2)
            somaPares += c;

        System.out.printf("Soma = %d\n",somaPares);


    }
}
