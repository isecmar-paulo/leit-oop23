package cv.isecmar;

import java.util.Scanner;

public class F31c {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite valor de n:");
        int numeroLido = keyboard.nextInt();

        System.out.println("Alinea 1c -- Todas as potências de dois menos que n");
        double potencia2 = 0;
        int numero = 0;
        while  (Math.pow(numero,2) < numeroLido) {
            potencia2 = Math.pow(numero,2);

            System.out.printf("%d elevado a 2 = %.0f \n",numero, potencia2);
            numero++;

        }


    }
}
