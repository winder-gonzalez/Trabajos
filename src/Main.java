import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println("*  *  *  * Ejercicio Dados *  *  *  *");
      //lanzadas
      int min = 2 ;
      int max = 100 ;

        Random aleatorio = new Random();

        int lanzada = aleatorio.nextInt((max - min +1))+min;
        System.out.println("Se realizaron " + lanzada +" lanzadas de dados");
        //tiradas de dados
        System.out.println("D1 || D2");
        int minD= 1;
        int maxD=6;

        int sumad1=0;
        int sumad2=0;

        for(int i=0;i<=lanzada;i++){
            int tirada1 = aleatorio.nextInt((maxD - minD +1))+minD;
            int tirada2 = aleatorio.nextInt((maxD - minD +1))+minD;

            sumad1+=tirada1;
            sumad2+=tirada2;
            System.out.println(tirada1 +"  || "+tirada2);
        }
        System.out.println("--------------");
        System.out.println("   Suma");
        System.out.println(sumad1+" || "+sumad2);

    }
}