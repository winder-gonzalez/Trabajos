public class Candidato2 {
    private int voto;
    private String nombre="Kevin";
    private int costoCampana;

    public Candidato2(){
        voto=0;
        nombre="Kevin";
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
        return "candidato3" +'\n'+
                "voto=" + voto +'\n'+
                ", nombre='" + nombre + '\n' +
                ", costoCampana=" + costoCampana
                ;
    }

}
