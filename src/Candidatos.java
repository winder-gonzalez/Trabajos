public class Candidatos {

   private candidato1 candidato1;
   private Candidato2 candidato2;
   private Candidato3 candidato3;
   public Candidatos (){
         candidato1 =new candidato1();
         candidato2 =new Candidato2();
         candidato3 =new Candidato3();
   }
    public int votosTotal(){
       int votosTotal=candidato1.getVoto()+candidato2.getVoto()+candidato3.getVoto();
       return votosTotal;
    }
   public double porcentajeCanditato1(){
       double r1=votosTotal();
       double r2= candidato1.getVoto() ;
       return (r2/r1)*100;

   }
    public double porcentajeCanditato2(){

        double r1=votosTotal();
        double r2= candidato2.getVoto() ;
        return (r2/r1)*100;
    }
    public double porcentajeCanditato3(){
        double r1=votosTotal();
        double r2= candidato3.getVoto() ;
        return (r2/r1)*100;
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
