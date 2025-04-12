import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        boolean estado = true;
        int vida = 15, xp = 0,opc,max=12,min=1,max2=3,min2=1;

        do {
            System.out.println("\n     &  &  & Juego aventurero &  &  & ");
            System.out.println("vida :" + vida + "  experiencia : " + xp);
            System.out.println("¿Quieres lanzadar el dado ? 1)si 2)no ");
            opc = teclado.nextInt();
            if(opc==1) {
                int num = random.nextInt(max - min + 1) + min;
                System.out.println("El numero obtenido es : "+num);
                if (num==1 | num==2){
                    System.out.println(" #  # Encuentras una fuente de vida #  # ");
                    System.out.println(" + 1 punto de vida ");
                    vida++;
                }if (num==3 | num==4 | num==5){
                    System.out.println(" #  # eres atacado brutalmente  #  # ");
                    System.out.println(" -5 punto de vida ");
                    vida-=5;
                }
                if (num==6 | num==7){
                    System.out.println(" #  # ganas experiencia en la aventura   #  # ");
                    System.out.println(" +3 puntos de experiencia ");
                    xp+=3;
                } if (num==8 | num==9){
                    System.out.println(" #  # cometes un error grave    #  # ");
                    System.out.println(" -6 puntos de experiencia ");
                    xp-=6;
                }if (num==10 | num==11){
                    System.out.println(" #  # cometes un error grave    #  # ");
                    System.out.println(" -8 puntos de vida ");
                    vida-=8;
                }if (num==12){
                    System.out.println(" #  # evento especial aleatorio   #  # ");
                    int numal = random.nextInt(max2 - min2 + 1) + min2;
                    if(numal==1){
                        System.out.println(" $  $ encuentras un pergamino antiguo  $  $ ");
                        System.out.println(" +10 puntos de experiencia  ");
                        xp+=10;
                    }if(numal==2){
                        System.out.println(" $  $ te infectas con veneno  $  $ ");
                        System.out.println(" -2 puntos de vida  ");
                        vida-=2;
                    }if(numal==3){
                        System.out.println(" $  $ un demonio ataca   $  $ ");
                        System.out.println(" tu vida se reduce a la mitad  ");
                        vida=vida/2;

                    }
                }


            }else{

            }

            if(vida<0){
                System.out.println("PERDISTE");
                estado=false;

            }if(xp>50){
                System.out.println("GANASTE ");
                estado=false;

            }
        } while (estado );

    }
}