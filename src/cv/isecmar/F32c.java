package cv.isecmar;

import java.util.Scanner;

public class F32c {

    public static void main(String[] args) {
        int somaI = 0;
        Scanner leituraIn = new Scanner(System.in);
        System.out.println("Valor de A: ");
        int valorA = leituraIn.nextInt();
        System.out.println("Valor de B: ");
        int valorB =  leituraIn.nextInt();

        for (int num=valorA; num <= valorB; num++) {
            if (num % 2 != 0) {
                somaI += num;
            }
        }
        System.out.printf("Soma de todos os impares entre %d e %d  = %d\n", valorA, valorB, somaI);


    }
}
