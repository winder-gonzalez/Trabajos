import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double peso ,estatura,indice;

        System.out.println("*  *  *  *  Indice de Masa Corporal *  *  *  *  ");
        System.out.println("ingrese su peso :");
        peso=teclado.nextDouble();

        System.out.println("ingrese su estatura :");
        estatura=teclado.nextDouble();

        indice=peso/(estatura*estatura);

        if (indice<=18.49){
            System.out.println("su indice es "+indice+" por lo tanto estas en peso bajo ");
        }if (indice>=18.50 && indice<=24.99){
            System.out.println("su indice es "+indice+" por lo tanto estas en peso normal");
        }if (indice>=25 && indice<=29.99){
            System.out.println("su indice es "+indice+" por lo tanto estas en sobrepeso ");
        }if (indice>=30 && indice<=34.99){
            System.out.println("su indice es "+indice+" por lo tanto estas en obesidad leve  ");
        }if (indice>=35 && indice<=39.99){
            System.out.println("su indice es "+indice+" por lo tanto estas en obesidad media ");
        }if (indice>=40){
            System.out.println("su indice es "+indice+" por lo tanto estas en obesidad morbidad ");
        }

    }
}