public  class mascota extends Animal {

    public mascota(String color, String nombre, int edad, String raza, AnimalesZ tipo, int nPatas, Alimentacion alimentacion, CubiertaCorporal cubiertaCorporal, String habilidad) {
        super(color, nombre, edad, raza, tipo, nPatas, alimentacion, cubiertaCorporal, habilidad);
        setComida(ejemploAlimentacion(alimentacion));
    }

    @Override
    public String ejemploAlimentacion(Alimentacion tipo) {
        String ejemplo;
        if(tipo.equals(Alimentacion.Carnivoro)){
            ejemplo="Carne,Huesos y Pescado";
            return ejemplo;
        } if(tipo.equals(Alimentacion.Herviboro)){
            ejemplo="Flores,Frutas y Hojas";
            return ejemplo;
        } if(tipo.equals(Alimentacion.Omnivoro)){
            ejemplo="Carne,Pescado,Frutas y Hojas";
            return ejemplo;
        }else{
            ejemplo="pailassss";
            return ejemplo;
        }

    }

    @Override
    public String toString() {
        return  "@  @  @  @  @  @  @  @  @  @  @  @  @  @   "+'\n'+
                "   Nombre= " + nombre + '\n' +
                "   Color= " + color + '\n' +
                "   Edad= " + edad +" años"+ '\n' +
                "   Raza= " + raza + '\n' +
                "   Tipo de Mascota= " + tipo + '\n' +
                "   Numero de Patas= " + nPatas +'\n'+
                "   Alimentacion= " + alimentacion + '\n' +
                "   Comida= " + comida + '\n' +
                "   Cubierta Corporal= " + cubiertaCorporal + '\n' +
                "   Habilidad= " + habilidad + '\n'+
                "@  @  @  @  @  @  @  @  @  @  @  @  @  @ "
                ;
    }
}
