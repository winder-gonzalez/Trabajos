import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opc;
        boolean cambio = true;
        //Variables para personas
        String n1, a1, d1;
        int e1;
        //Variables para perros
        String placa, nombre, raza, tamano;
        int edadP;
        boolean estadoPerro = false;
        List<Perro> lstPerros = new ArrayList<>();
        List<Persona> lstPersonas = new ArrayList<>();
        lstPersonas.add(new Persona("joan","chindoy",18,"1234"));
        lstPersonas.add(new Persona("kevin","santos",30,"5555"));
        lstPersonas.add(new Persona("win","g",12,"8888"));
        lstPerros.add(new Perro("A1","Spike","Pincher",10,"35"));
        lstPerros.add(new Perro("B2","Princesa","Chihuahua",8,"20"));

        System.out.println("    * * * * EJERCICIO ADOPTAR PERROS * * * *");

        do{
            System.out.println("""
                     + + + + MENÚ + + + +
                     1. Registrar Persona.
                     2. Registrar Perro.
                     3. Personas Registradas.
                     4. Perros Disponibles.
                     5. Adoptar Perro.
                     6. Consultar Perro Más Viejo.
                     7. Salir.
                 """);
            System.out.print("    Dígite la opción: ");
            opc = teclado.nextInt();
            switch (opc){
                case 1 -> {
                    teclado.nextLine();
                System.out.print("    Dígite el nombre de la persona: ");
                n1 = teclado.nextLine();
                System.out.print("    Dígite el apellido de la persona: ");
                a1 = teclado.nextLine();
                System.out.print("    Dígite la edad de la persona: ");
                e1 = teclado.nextInt();
                System.out.print("    Dígite el número de documento de la persona: ");
                d1 = teclado.nextLine();
                lstPersonas.add(new Persona(n1, a1, e1, d1));
                }
                case 2 -> {
                    teclado.nextLine();
                    System.out.print("    Dígite la placa del perro: ");
                    placa = teclado.nextLine();
                    System.out.print("    Dígite el nombre del perro : ");
                    nombre = teclado.nextLine();
                    System.out.print("    Dígite la raza del perro: ");
                    raza = teclado.nextLine();
                    System.out.print("    Dígite la edad del perro (en meses) : ");
                    edadP = teclado.nextInt();
                    System.out.print("    Dígite el tamaño del perro (en cm) : ");
                    tamano = teclado.nextLine();
                    lstPerros.add(new Perro(placa, nombre, raza, edadP,tamano));
                }
                case 3 ->{
                    teclado.nextLine();
                    System.out.println("--------- PERSONAS REGISTRADAS -------------");
                    System.out.println("" +
                            "   1)informacion general" +"\n"+
                            "   2)informacion detallada" );
                    System.out.println("Ingrese su opcion: ");
                    int l= teclado.nextInt();
                    if(l==1){
                        int i=1;
                        for(Persona persona : lstPersonas){

                            System.out.println(i+")"+persona.getNombre()+" "+persona.getApellido()+" Documento:"+persona.getDocumento());
                            i+=1;
                        }
                    }if(l==2){
                        System.out.print("Ingrese numero de documento : ");
                        String documento=teclado.next();
                        for(Persona persona : lstPersonas){
                            if(persona.getDocumento().equals(documento)) {
                                System.out.println(persona);
                            }
                        }

                    }
                }
                case 4 ->{
                    teclado.nextLine();
                    System.out.println("--------- PERROS DISPONIBLES -------------");
                    System.out.println("" +
                            "   1)informacion general" +"\n"+
                            "   2)informacion detallada" );
                    System.out.println("Ingrese su opcion: ");
                    int l= teclado.nextInt();
                    if(l==1){
                        int i=1;
                        for(Perro perro : lstPerros){
                            if(perro.) {
                                System.out.println(i + ")" + perro.getNombre() + " Placa:" + perro.getPlaca());
                                i += 1;
                            }
                        }
                    }if(l==2){
                        System.out.print("Ingrese placa del perro : ");
                        String p=teclado.next();
                        for(Perro perro : lstPerros){
                            if(perro.getPlaca().equals(p)) {
                                System.out.println(perro);
                            }
                        }

                    }
                }
                case 5 ->{
                    System.out.println("--------- ADOPTAR -------------");
                    System.out.println("¿Cual persona va adoptar ?");
                    int i=1;
                    for (Persona persona:lstPersonas){
                        System.out.println(i+")"+persona.getNombre()+" "+persona.getApellido());
                        i++;
                    }
                    int persona=teclado.nextInt();
                    System.out.println("¿Cual perro desea adoptar?");
                    i=1;
                    for (Perro perro:lstPerros){
                        System.out.println(i+")"+perro.getNombre());
                        i++;
                    }
                    int perro= teclado.nextInt();

                    lstPersonas.get(persona-1).adoptarPerro(lstPerros.get(perro-1));
                }
                }

        }while (cambio);
    }
}