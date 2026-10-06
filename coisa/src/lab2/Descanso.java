package lab2;
/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20250029111
 * @author Samuel Roger
 */
public class Descanso {
    private int horasDescanso;
    private int numerosSemanas;

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }
    public void defineNumeroSemanas(int numerosSemanas) {
        this.numerosSemanas = numerosSemanas;
    }
    public String getStatusGeral() {
        if (numerosSemanas == 0 || horasDescanso == 0){
            return "Cansado";
        }else if(horasDescanso/numerosSemanas >= 26){
            return "Descansado";
        }else{
            return "Cansado";
        }
    }
}
