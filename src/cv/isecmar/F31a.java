package cv.isecmar;

import java.util.Scanner;

public class F31a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite valor de n:");
        int numeroLido = keyboard.nextInt();

        System.out.println("Alinea 1a -- Todos os quadrados menores que número n");
        int numero=0, nquadrado = 0;

        while (nquadrado < numeroLido) {
            nquadrado = numero * numero;
            System.out.printf("Quadrado de %d = %d\n", numero++, nquadrado);
            nquadrado = numero * numero;
        }


    }
}
