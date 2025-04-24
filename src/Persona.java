import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> lstPerros = new ArrayList<>();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        lstPerros = new ArrayList<Perro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public List<Perro> getLstPerros() {
        return lstPerros;
    }

    public void setLstPerros(List<Perro> lstPerros) {
        this.lstPerros = lstPerros;
    }

    public void adoptarPerro (Perro perro){
        if(perro.isAdoptado()==false) {

            if (lstPerros.size() > 3) {
                System.out.println("    No puede adoptar más perros");
            } else {
                lstPerros.add(perro);
                perro.setAdoptado(true);
            }
        }else{
            System.out.println("El perro ya esta adoptado ");
        }
    }

    public Perro  perroMasGrande (){
       Perro perroGrande=null;
       int edad =-1;
       for(Perro perro : lstPerros){
           if(perro.getEdad()>edad){
               edad=perro.getEdad();
               perroGrande=perro;
           }
       }
        return perroGrande;
    }

    @Override
    public String toString() {
        return "\n Nombre= " + nombre +
                "\n Apellido= " + apellido +
                "\n Edad= " + edad +
                "\n Documento= " + documento +
                "\n Perros Adoptados: "  ;
    }
    public void  perrosAdoptados(){
        if(lstPerros.size()!=0){
            for (Perro perro2 : lstPerros){
                System.out.print(perro2.getNombre()+" , ");

            }
        }else{
            System.out.println("No tiene perros adoptados ");
        }
   }
}
