public class Candidatos {
   private int votosTotal;
   private candidato1 candidato1;
   private Candidato2 candidato2;
   private Candidato3 candidato3;
   public Candidatos (){
       votosTotal=0;

   }

   public int porcentajeCanditato1(){
       return (candidato1.getVoto()/votosTotal)*100;
   }
    public int porcentajeCanditato2(){
        return (candidato2.getVoto()/votosTotal)*100;
    }
    public int porcentajeCanditato3(){
        return (candidato3.getVoto()/votosTotal)*100;
    }

    public int costoPromedioCampanas(){
       int costo= candidato1.getCostoCampana()+candidato2.getCostoCampana()+candidato3.getCostoCampana();
       return costo/3;
    }

    public void vaciarUrnas(){
       candidato1.vaciarUrnas();
       candidato2.vaciarUrnas();
       candidato3.vaciarUrnas();
    }

    public int getVotosTotal() {
        return votosTotal;
    }

    public candidato1 getCandidato1() {
        return candidato1;
    }

    public Candidato2 getCandidato2() {
        return candidato2;
    }

    public Candidato3 getCandidato3() {
        return candidato3;
    }
}
