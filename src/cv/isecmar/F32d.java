package cv.isecmar;

import javax.swing.*;
import java.util.Scanner;

public class F32d {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int somaDigitos=0;
        String numeroLido = keyboard.next();
        int soma = 0;
        int p = 0;
        while ( p < numeroLido.length()  ) {
            String numC = ""+numeroLido.charAt(p);

            if ( Integer.parseInt(numC) % 2 != 0) {
                somaDigitos += Integer.parseInt(numC);
            }
            p++;

        }
        System.out.printf("Soma de digitos impares do nunero %s = %d\n", numeroLido, somaDigitos);



    }
}
