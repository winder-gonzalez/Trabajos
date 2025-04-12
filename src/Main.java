import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean estado=true;
    private static Candidatos candidatos;
    public static void main(String[] args) {
        do{
            menu();
        }while(estado);


    }

    public static void menu(){
        Scanner in =new Scanner(System.in);

        System.out.println("&  &  &  &  MENU  &  &  &  &");
        System.out.println("1)Votar");
        System.out.println("2)Mostrar Resultados");
        System.out.println("3)Vaciar urnas");
        System.out.println("4)Salir ");
        int opc = in.nextInt();
        switch (opc){
            case 1 ->{
                System.out.println("&  &  &  &  VOTA POR UN CANDIDATO   &  &  &  &");
                System.out.println("elija un candidato");
                System.out.println("1) "+candidatos.getCandidato1().getNombre());
                System.out.println("2) "+candidatos.getCandidato2().getNombre());
                System.out.println("3) "+candidatos.getCandidato3().getNombre());

                int c =in.nextInt();

                System.out.println("elija el medio de eleccion");

                System.out.println("1)Internet");
                System.out.println("2)Radio");
                System.out.println("3)television");
                int m =in.nextInt();

                if (c==1){
                    candidatos.getCandidato1().votarCandidato(m);
                }if (c==2){
                    candidatos.getCandidato2().votarCandidato(m);
                }if (c==3){
                    candidatos.getCandidato3().votarCandidato(m);
                }
            }
            case 2->{
                System.out.println("&  &  &  &  Motrar Resultados    &  &  &  &");

                System.out.println("Votos Totales : "+candidatos.getVotosTotal()+"\n");
                System.out.println("Porcentaje Votos Candidato 1 : "+candidatos.porcentajeCanditato1());
                System.out.println("Porcentaje Votos Candidato 2 : "+candidatos.porcentajeCanditato2());
                System.out.println("Porcentaje Votos Candidato 3 : "+candidatos.porcentajeCanditato3()+"\n");

                System.out.println("Costo promedio Campaña : "+candidatos.costoPromedioCampanas());
            }
            case 3->{
                candidatos.vaciarUrnas();
                System.out.println("## se han vaciado las urnas ## ");
            }
            case 4->{
                estado=false;
            }
        }

    }


}