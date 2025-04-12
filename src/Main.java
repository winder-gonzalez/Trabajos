import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n # # # CONVERSOR DE GRADOS # # #");
        boolean estado=true;
        double num;
        double  resultado;
        do{
            int opc;
            System.out.println("1) Celsius a Farenheit " );
            System.out.println("2) Celsius a Kelvin " );
            System.out.println("3) Celsius a Rankine " );
            System.out.println("4) Celsius a Reamur " );

            System.out.println("5) Farenheit a Celsius " );
            System.out.println("6) Farenheit a Kelvin " );
            System.out.println("7) Farenheit a Rankine " );
            System.out.println("8) Farenheit a Reamur " );

            System.out.println("9)  kelvin a Celsius " );
            System.out.println("10) kelvin a Farenheit  " );
            System.out.println("11) kelvin a Rankine " );
            System.out.println("12) kelvin a Reamur " );

            System.out.println("13) Rankine a Celsius " );
            System.out.println("14) Rankine a Farenheit  " );
            System.out.println("15) Rankine a Kelvin  " );
            System.out.println("16) Rankine a Reamur " );

            System.out.println("17) Salir ");

            System.out.println("ingrese un numero de 1 a 17 :");
            opc =teclado.nextInt();

            switch (opc){
                case 1 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Celsius a Farenheit  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num*9/5)+32;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;



                case 2 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Celsius a Kelvin  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num+273.15;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 3 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Celsius a Rankine  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num+273.15)*9/5;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 4 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Celsius a Reamur  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num*4/5;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 5 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Farenheit a Celsius  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-32)*5/9;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;

                case 6 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Farenheit a Kelvin  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-32)*5/9+32;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 7 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Farenheit a Rankine  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num+459.67;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 8 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Farenheit a Reaumur  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-32)*5/9+32;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 9 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  kelvin a Celsius  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num-273.15;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 10 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  kelvin a Farenheit  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-273.15)*9/5+32;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 11 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  kelvin a Rankine  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num*9/5;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 12 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  kelvin a Reaumur  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-273.15)*4/5;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 13 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Rankine a Celsius  &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-491.67)*5/9;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 14 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Rankine a Farenheit   &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num-459.67;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 15 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Rankine a Kelvin   &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=num*5/9;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;
                case 16 :
                    System.out.println("\n -----------------------------------------");
                    System.out.println("&  &  Rankine a Reaumur   &  &");
                    System.out.println("ingrese un valor");
                    num=teclado.nextDouble();

                    resultado=(num-491.67)*4/9;
                    System.out.println("El resultado es "+resultado);
                    System.out.println(" -----------------------------------------\n");
                    break;

                case 17:
                    System.out.println("\n -----------------------------------------");
                    int salir ;
                    System.out.println("seguro que quieres salir   1)si  2)no ");
                    salir=teclado.nextInt();

                    if(salir==1){
                        estado=false;
                    }if(salir==2){
                    estado=true;
                }else {
                    estado = false;
                }
                    System.out.println(" -----------------------------------------\n");
                    break;

                default:
                    System.out.println("ERROR ingrese un numero valido  ");

            }

        }while(estado);

    }
}