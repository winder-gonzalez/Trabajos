public class EmpleadoPlanta extends Empleado {
    private int salarioFijo=2100000;

    public EmpleadoPlanta(String nombre, int edad) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public int getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(int salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    public void mostrarInfo(){
        System.out.println("" +
                "Nombre : "+nombre+"\n"
                +"Edad : "+ edad +"\n"
                +"Salario Fijo  : "+ salarioFijo +"\n"
        );


    }
}
