package lab2;
/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20250029111
 * @author Samuel Roger
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public void adicionaTempoOnline(int tempoOnline) {
        this.tempoOnline += tempoOnline;
    }
    public boolean atingiuMetaTempoOnline(){
        return tempoOnline >= tempoOnlineEsperado;
    }

    @Override
    public String toString() {
        return  "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", tempoOnline=" + tempoOnline +
                ", tempoOnlineEsperado=" + tempoOnlineEsperado +
                '}';
    }
}