import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;

      
        boolean estado = true;

        do {
            menu();
            opc = in.nextInt();
            if (opc==1){
                menuDomestico();
            }if(opc==2){
                menuExotico();
            }if(opc==3){
                estado=false;
            }

        } while (estado);


    }

    public static void menu() {
        System.out.println("---------------------------------------");
        System.out.println("    $    ZOOLOGICO UNIMINUTO    $ ");
        System.out.println("---------------------------------------");
        System.out.println("Bienvenidos al zoologico uniminito ");
        System.out.println("¿Que quieres empezar a ver ?");
        System.out.println("    1)Animales Domesticos ");
        System.out.println("    2)Animales Exoticos  ");
        System.out.println("    3)Salir <-  ");

    }

    public static void menuDomestico() {
        boolean estado = true;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------------");
            System.out.println("    &    ANIMALES DOMESTICOS   & ");
            System.out.println("---------------------------------------");
            System.out.println("¿Que animales te llaman la atencion  ?");
            System.out.println("    1)Perros");
            System.out.println("    2)Ovejas");
            System.out.println("    3)Gallinas");
            System.out.println("    4)Regresar <-");

            int eleccion;

            eleccion = in.nextInt();

            switch (eleccion) {
                case 1 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    &    PERROS   & ");
                    System.out.println("---------------------------------------");
                    for (Domesticos animal : AnimalesDomesticos()) {
                        if (animal.getTipo().equals(Animal.AnimalesZ.Perro)) {
                            System.out.println(animal);
                        }

                    }
                }
                case 2 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    &    OVEJAS   & ");
                    System.out.println("---------------------------------------");
                    for (Domesticos animal : AnimalesDomesticos()) {
                        if (animal.getTipo().equals(Animal.AnimalesZ.Oveja)) {
                            System.out.println(animal);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    &    GALLINAS   & ");
                    System.out.println("---------------------------------------");
                    for (Domesticos animal : AnimalesDomesticos()) {
                        if (animal.getTipo().equals(Animal.AnimalesZ.Gallina)) {
                            System.out.println(animal);
                        }
                    }
                }
                case 4 -> {
                        estado=false;
                }

                default -> {
                    System.out.println("* * Ingrese un valor valido * * ");
                }

            }
        }while (estado);
    }
    public static void menuExotico() {
        boolean estado = true;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------------");
            System.out.println("    &    ANIMALES EXOTICOS   & ");
            System.out.println("---------------------------------------");
            System.out.println("¿Que animales te llaman la atencion  ?");
            System.out.println("    1)Serpientes");
            System.out.println("    2)Mapaches");
            System.out.println("    3)Capibara");
            System.out.println("    4)Regresar <-");

            int eleccion;

            eleccion = in.nextInt();

            switch (eleccion) {
                case 1 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    &    SERPIENTES   & ");
                    System.out.println("---------------------------------------");
                    for (Exoticos animal : AnimalesExoticos()) {
                        if (animal.getTipo().equals(Animal.AnimalesZ.Serpiente)) {
                            System.out.println(animal);
                        }

                    }
                }
                case 2 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    &    MAPACHES   & ");
                    System.out.println("---------------------------------------");
                    for (Exoticos animal : AnimalesExoticos()) {
                        if (animal.getTipo().equals(Animal.AnimalesZ.Mapache)) {
                            System.out.println(animal);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("---------------------------------------");
                    System.out.println("    &    CAPIBARA   & ");
                    System.out.println("---------------------------------------");
                    for (Exoticos animal : AnimalesExoticos()) {
                        if (animal.getTipo().equals(Animal.AnimalesZ.Capibara)) {
                            System.out.println(animal);
                        }
                    }
                }
                case 4 -> {
                    estado=false;
                }

                default -> {
                    System.out.println("* * Ingrese un valor valido * * ");
                }

            }
        }while (estado);
    }

    public static List<Domesticos> AnimalesDomesticos() {
        List<Domesticos> animalesDomesticos = new ArrayList<Domesticos>();
        Perro perro1 = new Perro("Cafe", "Caballero", 4, "Golden Retriever");
        Perro perro2 = new Perro("Negro", "Princesa", 7, "Siberiano");
        Perro perro3 = new Perro("Blanco", "Coco", 2, "Pomeriana");

        Oveja oveja1 = new Oveja("Rosada", "Gloria", 1, "Merino");
        Oveja oveja2 = new Oveja("Negra", "Lola", 2, "Corriedale");
        Oveja oveja3 = new Oveja("Blanca", "Silvia", 5, "Frisona Oriental");

        Gallina gallina1 =new Gallina("Naranja","Claudia",1,"Tufus");
        Gallina gallina2 =new Gallina("Blanca","Linda",2,"Piroca");
        Gallina gallina3 =new Gallina("Cafe","Mona",1,"Calzada");

        animalesDomesticos.add(perro1);
        animalesDomesticos.add(perro2);
        animalesDomesticos.add(perro3);

        animalesDomesticos.add(oveja1);
        animalesDomesticos.add(oveja2);
        animalesDomesticos.add(oveja3);

        animalesDomesticos.add(gallina1);
        animalesDomesticos.add(gallina2);
        animalesDomesticos.add(gallina3);
        return animalesDomesticos;
    }
    public static List<Exoticos> AnimalesExoticos() {
        List<Exoticos> animalesExoticos = new ArrayList<Exoticos>();

        Serpiente serpiente1 = new Serpiente("Cafe","Randall",5,"Boa");
        Serpiente serpiente2 = new Serpiente("Beige","Jenny",2,"Cascabel");
        Serpiente serpiente3 = new Serpiente("Negra","Lucy",10,"Anaconda");

        Capibara capibara1=new Capibara("Rojo","Juan",1,"Cabira Menor  ");
        Capibara capibara2=new Capibara("Cafe","Tio",2,"Capibara Comun  ");

        Mapache mapache1= new Mapache("Gris","Lucas",2,"Boreal");
        Mapache mapache2= new Mapache("Cafe","Rigby",3,"Cangrejo");
        Mapache mapache3= new Mapache("Rojizos","Apache",3,"Enano");

        animalesExoticos.add(serpiente1);
        animalesExoticos.add(serpiente2);
        animalesExoticos.add(serpiente3);

        animalesExoticos.add(capibara1);
        animalesExoticos.add(capibara2);


        animalesExoticos.add(mapache1);
        animalesExoticos.add(mapache2);
        animalesExoticos.add(mapache3);
        return animalesExoticos;
    }




}