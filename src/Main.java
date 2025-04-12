import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean estado=true;
    static Candidatos candidatos ;
    public static void main(String[] args) {
        candidatos =new Candidatos();
        do{
            menu();
        }while(estado);


    }

    public static void menu(){
        Scanner in =new Scanner(System.in);

        System.out.println("\n  &  &  &  &|  MENU  |&  &  &  &");
        System.out.println("    1)Votar");
        System.out.println("    2)Mostrar Resultados");
        System.out.println("    3)Vaciar urnas");
        System.out.println("    4)Salir ");
        System.out.print(" Ingrese una opcion : ");
        int opc = in.nextInt();
        switch (opc){
            case 1 ->{
                boolean estadov=true;
                do{
                System.out.println("\n *  *  *|  VOTA POR UN CANDIDATO  |*  *  * ");
                System.out.println("elija un candidato");
                System.out.println("    1) "+candidatos.getCandidato1().getNombre());
                System.out.println("    2) "+candidatos.getCandidato2().getNombre());
                System.out.println("    3) "+candidatos.getCandidato3().getNombre());
                System.out.println("    4)Regresar <- ");
                    System.out.print(" Ingrese una opcion : ");
                int c =in.nextInt();
                    if(c!=1 & c!=2 &c!=3){
                        estadov=false;
                    }else{
                System.out.println("---------|-------------------|---------------------|--------");
                System.out.println("\nelija el medio de eleccion");

                System.out.println("    1)Internet");
                System.out.println("    2)Radio");
                System.out.println("    3)television");
                        System.out.print(" Ingrese una opcion : ");
                int m =in.nextInt();

                if (c==1){
                    candidatos.getCandidato1().votarCandidato(m);
                }if (c==2){
                    candidatos.getCandidato2().votarCandidato(m);
                }if (c==3){
                    candidatos.getCandidato3().votarCandidato(m);
                }}
                }while(estadov);
            }
            case 2->{
                System.out.println("\n  WWWWWWW|  MOSTRAR RESULTADOS   |WWWWWW");
                if(candidatos.votosTotal()!=0 ) {
                    System.out.println("Votos Totales : " + candidatos.votosTotal() + "\n");
                    System.out.println("Porcentaje Votos Candidato 1 : " + candidatos.porcentajeCanditato1()+"%");
                    System.out.println("Porcentaje Votos Candidato 2 : " + candidatos.porcentajeCanditato2()+"%");
                    System.out.println("Porcentaje Votos Candidato 3 : " + candidatos.porcentajeCanditato3()+"%" + "\n");

                    System.out.println("Costo promedio Campaña : " + candidatos.costoPromedioCampanas());
                }else{
                    System.out.print("\nXXXXXXXX| TODAVIA NO HA VOTADO NADIE |XXXXXXXX"+"\n");
                }
            }
            case 3->{
                candidatos.vaciarUrnas();
                System.out.println("\n## SE HAN VACIADO LAS URNAS  ## ");
            }
            case 4->{
                estado=false;
            }
        }

    }


}