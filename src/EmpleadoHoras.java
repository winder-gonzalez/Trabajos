public class EmpleadoHoras extends Empleado {
    private int horasTrabajadas;
    private int salarioHora=98000;

    public EmpleadoHoras(String nombre, int edad, int horasTrabajadas) {
        super(nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int calcularSalario(int horas, int salario ){
        return horas*salario;
    }
    public void mostrarInfo(){
        System.out.println("" +
                "Nombre : "+nombre+"\n"
                +"Edad : "+ edad +"\n"
                +"Salario  : "+ calcularSalario(horasTrabajadas,salarioHora) +"\n"
        );


    }
}
