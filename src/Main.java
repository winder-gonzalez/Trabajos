import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Empleado> empleados = new ArrayList<Empleado>();
    static boolean estado=true;
    public static void main(String[] args) {

        do{
            menu();
        }while(estado);

    }

    public static void menu(){

        Scanner in = new Scanner(System.in);
        System.out.println("#  #  #  #  REGISTRO EMPLEADOS  #  #  #  #  " +"\n"+
                "1)Registrar Empleado de planta " +"\n"+
                "2)Registrar Empleado por horas " +"\n"+
                "3)Mostrar Informacion " +"\n"+
                "4)Salir");
        int opc= in.nextInt();
        switch(opc){
            case 1->{
                in.nextLine();
                String nombre;
                int edad;


                System.out.println("%  %  %  % REGISTRAR EMPLEADO DE PLANTA %  %  %  %  ");
                System.out.print("ingrese el nombre :"+"\n");
                nombre=in.nextLine();
                System.out.println("Ingrese la edad :");
                edad=in.nextInt();
                empleados.add(new EmpleadoPlanta(nombre,edad));

                System.out.println("$  $  $  $ Se ha registrado con exito $  $  $  $");

            }
            case 2->{
                in.nextLine();
                String nombre;
                int edad;
                int horas;


                System.out.println("%  %  %  % REGISTRAR EMPLEADO POR HORAS %  %  %  %  "
                );
                System.out.print("ingrese el nombre :"+"\n");
                nombre=in.nextLine();
                nombre=in.nextLine();
                System.out.println("Ingrese la edad :");
                edad=in.nextInt();
                System.out.println("Ingrese las horas trabajadas :");
                horas=in.nextInt();
                empleados.add(new EmpleadoHoras(nombre,edad,horas));

                System.out.println("$  $  $  $ Se ha registrado con exito $  $  $  $");

            }
            case 3->{

                System.out.println("°  °  °  °  ° MOSTRAR INFORMACION °  °  °  °  " +"\n"+
                        "1)Empleados Planta " +"\n"+
                        "2)Empleados por Horas" +"\n"+
                        "3)Empleados en General");
                int opcion= in.nextInt();
                if(opcion==1){
                    System.out.println("--------------------------------");
                    for (Empleado empleado : empleados) {
                        if(empleado instanceof EmpleadoPlanta){
                            ((EmpleadoPlanta) empleado).mostrarInfo();
                        }
                    }
                }if(opcion==2){
                    System.out.println("--------------------------------");
                    for (Empleado empleado : empleados) {
                        if(empleado instanceof EmpleadoHoras){
                            ((EmpleadoHoras) empleado).mostrarInfo();
                        }
                    }
                }if(opcion==3){
                    System.out.println("--------------------------------");
                    for (Empleado empleado : empleados) {
                        if (empleado instanceof EmpleadoHoras){
                            ((EmpleadoHoras) empleado).mostrarInfo();
                        }if (empleado instanceof EmpleadoPlanta){
                            ((EmpleadoPlanta) empleado).mostrarInfo();
                        }
                    }
                }

            }
            case 4->{
                estado=false;
            }
            default->{
                System.out.println("¡¡¡¡¡¡¡¡¡ingrese una opcion valida!!!!!");

            }
        }

    }

}