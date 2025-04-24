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
        lstPerros.add(new Perro("C3","KK","Pitbull",15,"125"));
        lstPerros.add(new Perro("D4","TT","Pastor",6,"120"));

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
                    System.out.println("$  $  $  $ REGISTRAR PERSONAS $  $  $  $ ");
                    teclado.nextLine();
                System.out.print("    Dígite el nombre de la persona: ");
                n1 = teclado.nextLine();
                System.out.print("    Dígite el apellido de la persona: ");
                a1 = teclado.nextLine();
                System.out.print("    Dígite la edad de la persona: ");
                e1 = teclado.nextInt();
                System.out.print("    Dígite el número de documento de la persona: ");
                d1 = teclado.next();
                lstPersonas.add(new Persona(n1, a1, e1, d1));
                }
                case 2 -> {
                    System.out.println("$  $  $  $ REGISTRAR PERROS $  $  $  $ ");
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
                    tamano = teclado.next();
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
                                persona.perrosAdoptados();
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

                        for(Perro perro : lstPerros){
                            if(perro.isAdoptado()==false) {
                                System.out.println( "- " + perro.getNombre() + " Placa:" + perro.getPlaca());

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
                    int per;
                    int perso;
                    System.out.println("--------- ADOPTAR PERRO -------------");
                    System.out.println("¿Cual persona va adoptar ?");
                    int i=1;
                    for (Persona persona:lstPersonas){
                        System.out.println(i+")"+persona.getNombre()+" "+persona.getApellido());
                        i++;
                    }


                    if(lstPersonas.size()!=0){
                        perso=teclado.nextInt();
                        System.out.println("¿Cual perro desea adoptar?");
                        i=1;
                        for (Perro perro:lstPerros){
                                System.out.println(i+")"+perro.getNombre());
                                i++;
                        }
                        if(lstPerros.size()!=0){
                            per= teclado.nextInt();
                            if(lstPerros.get(per-1).isAdoptado()==false){
                                lstPersonas.get(perso - 1).adoptarPerro(lstPerros.get(per - 1));
                            }else{
                                System.out.println("El perro ya esta adoptado");
                            }
                        }else{
                            System.out.println("No hay perros para hacer adoptados ");
                        }
                    }else{
                        System.out.println("No hay personas registradas ");
                    }
                }
                case 6 ->{
                    teclado.nextLine();
                    System.out.println("--------- PERRO MAS VIEJO -------------");
                    System.out.println("" +
                            "   1)Perro mas viejo en general " +"\n"+
                            "   2)Perro mas viejo por persona " );
                    System.out.println("Ingrese su opcion: ");
                    int l= teclado.nextInt();
                    if(l==1){
                        if(lstPersonas.size()!=0) {
                        Perro perroGrande=null;
                        int edad=-1;
                        for (Perro perro : lstPerros){
                            if(perro.getEdad()>edad){
                                edad=perro.getEdad();
                                perroGrande=perro;
                            }
                        }
                            System.out.println(perroGrande);
                        }else{
                            System.out.println("No hay perros ");
                        }
                    }if(l==2){
                        System.out.println("Ingrese el numero de documento de la persona : ");
                        String doc= teclado.next();
                        boolean check=false;
                        for(Persona persona : lstPersonas){
                            if(persona.getDocumento().equals(doc)){
                                check=true;
                                if(persona.getLstPerros().size()!=0) {
                                    System.out.println(persona.perroMasGrande());
                                }else{
                                    System.out.println("No tiene perros adoptados ");
                                }
                            }
                        }if(check==false){
                            System.out.println("No se encontro la persona ");
                        }
                    }
                }
                }

        }while (cambio);
    }
}