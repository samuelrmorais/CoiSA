package lab2;

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
        return "RegistroTempoOnline{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", tempoOnline=" + tempoOnline +
                ", tempoOnlineEsperado=" + tempoOnlineEsperado +
                '}';
    }
}