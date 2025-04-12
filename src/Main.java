import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int min=1;
        int max=3;
        int apostar;
        boolean seguir=true;
        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese el saldo a jugar ");
        int saldo=teclado.nextInt();

      do{

          System.out.println("* * * * REALIZANDO APUESTA * * * *");
          int numero;
          Random aleatorio = new Random();

            apostar= aleatorio.nextInt((max-min+1)+min);

          if (apostar==1){
              saldo=saldo*2;
              System.out.println("+  +  + HAZ GANADO EL DOBLE  +  +  +");
              System.out.println("Resultado del sorteo : "+apostar);

              System.out.println("Saldo : "+saldo);
              System.out.println("Quiere seguir jugando  Si(1) No(2) ");
              int opc=teclado.nextInt();
              if(opc==1){
                  seguir=true;
              }else {
                  seguir=false;
              }


          }  if (apostar==2){
              saldo=saldo/2;
              System.out.println("-  -  - HAZ PERDIDO LA MITAD -  -  -");
              System.out.println("Resultado del sorteo : "+apostar);

              System.out.println("Saldo : "+saldo);

              System.out.println("Quiere seguir jugando  Si(1) No(2) ");
              int opc=teclado.nextInt();
              if(opc==1){
                  seguir=true;
              }else {
                  seguir=false;
              }


          }  if (apostar==3){
              saldo=0;
              System.out.println("#  #  # HAZ PERDIDO TODO #  #  #");
              System.out.println("Resultado del sorteo : "+apostar);
              System.out.println("Saldo : "+saldo);

              seguir =false;
          }
      }while( seguir);

    }



}