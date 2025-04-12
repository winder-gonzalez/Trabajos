import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("      &  &  & CALCULADORA &  &  & ");
        System.out.println("¿Cuántas operaciones deseas realizar? ");
        int numOperaciones = teclado.nextInt();
        int max = 100;
        int min = 1;

        for(int i = 0; i < numOperaciones; ++i) {
            int num1 = random.nextInt(max - min + 1) + min;
            int num2 = random.nextInt(max - min + 1) + min;
            System.out.println("");
            System.out.println("*  *  *  *  *  *  *  *  * OPERACION "+ (i+1) +" *  *  *  *  *  *  *  *  *");
            System.out.println("");
            System.out.println("Introduce el signo aritmético (+, -, *, /, ^, %): ");
            String signo = teclado.next();
            double resultado = 0;
            System.out.println("#  #  #  #  #  # RESULTADOS #  #  #  #  #  # ");
            switch (signo) {
                case "+":

                    resultado = (double)(num1 + num2);
                    System.out.println("el numero 1 es : " + num1);
                    System.out.println("el numero 2 es : " + num2);
                    break;
                case "-":
                    resultado = (double)(num1 - num2);
                    System.out.println("el numero 1 es : " + num1);
                    System.out.println("el numero 2 es : " + num2);
                    break;
                case "*":
                    resultado = (double)(num1 * num2);
                    System.out.println("el numero 1 es : " + num1);
                    System.out.println("el numero 2 es : " + num2);
                    break;
                case "/":
                    resultado = (double)num1 / (double)num2;
                    System.out.println("el numero 1 es : " + num1);
                    System.out.println("el numero 2 es : " + num2);
                    break;
                case "^":
                    resultado = Math.pow((double)num1, (double)num2);
                    System.out.println("el numero 1 es : " + num1);
                    System.out.println("el numero 2 es : " + num2);
                    break;
                case "%":
                    resultado = (double)(num1 % num2);
                    System.out.println("el numero 1 es : " + num1);
                    System.out.println("el numero 2 es : " + num2);
                    break;
                default:
                    System.out.println("Signo aritmético no válido.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

        }

    }
}