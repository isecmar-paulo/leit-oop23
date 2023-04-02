package cv.isecmar;

import java.util.Scanner;

public class F31b {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite valor de n:");
        int numeroLido = keyboard.nextInt();

        System.out.println("Alinea 1b  - Todos os numeros positivos divisiveis por 10 e menores que número n");
        int numero=10;

        while  ( (numero < numeroLido) ){

            System.out.printf("%d\n",numero);
            numero += 10;

        }


    }
}
