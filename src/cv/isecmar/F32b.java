package cv.isecmar;

import java.util.Scanner;

public class F32b {

    public static void main(String[] args) {
        System.out.println("Alinea 2b -- A soma de todos os quadrados entre 1 e 100 (inclusive).");
        int somaQ = 0;

        for (int c=1; c <= 100; c=c+2)
            somaQ += c * c;

        System.out.printf("Soma = %d\n",somaQ);


    }
}
