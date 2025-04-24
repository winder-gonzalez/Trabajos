public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private boolean adoptado = false;

    public Perro() {
    }

    public Perro(String placa, String nombre, String raza, int edad, String tamano) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "\n Placa = " + placa +
                "\n Nombre = " + nombre +
                "\n Raza = " + raza +
                "\n Edad = " + edad +
                "\n Tamaño = " + tamano +
                "\n Adoptado = " + adoptado;
    }
}
