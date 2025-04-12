public class Candidato3 {
    private int voto;
    private String nombre="Winder";
    private int costoCampana;

    public Candidato3(){
        voto=0;
        nombre="Winder";
        costoCampana=0;
    }
    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCostoCampana() {
        return costoCampana;
    }

    public void setCostoCampana(int costoCampana) {
        this.costoCampana = costoCampana;
    }

    public void votarCandidato(int medio){
        voto++;
        if(medio==1){
            costoCampana+=700000;
        } if(medio==2){
            costoCampana+=200000;
        } if(medio==3){
            costoCampana+=600000;
        }
    }


    public void vaciarUrnas(){
        costoCampana=0;
        voto=0;
    }

    @Override
    public String toString() {
        return "candidato2" +'\n'+
                "voto=" + voto +'\n'+
                ", nombre='" + nombre + '\n' +
                ", costoCampana=" + costoCampana
                ;
    }

}
