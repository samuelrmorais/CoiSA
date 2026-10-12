package lab2;

import java.util.Arrays;
/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20250029111
 * @author Samuel Roger
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];
    private double[] pesos;

    public Disciplina(String nomeDisciplina) {
        this(nomeDisciplina, 4);
    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroDeNotas];
    }

    public Disciplina(String nomeDisciplina, int numeroDeNotas, double[] pesos) {
        this(nomeDisciplina, numeroDeNotas);
        this.pesos = pesos;
    }
    public void cadastraNota(int numeroNota, double valorNota){
        this.notas[numeroNota - 1] = valorNota;
    }

    public void cadastraHoras(int horasEstudo){
        this.horasEstudo += horasEstudo;
    }
    public double calculaMedia() {
        double somaNotas = 0;
        double somaPesos = 0;

        for (int i = 0; i < this.notas.length; i++) {
            double peso = (this.pesos == null) ? 1 : this.pesos[i];
            somaNotas += this.notas[i] * peso;
            somaPesos += peso;
        }

        return somaNotas / somaPesos;
    }
    public boolean aprovado() {
        return this.calculaMedia() >= 7.0;
    }

    @Override
    public String toString() {
        return "nomeDisciplina: " + nomeDisciplina + ", Horas: " + horasEstudo + ", Média: " + calculaMedia() +
                ", Notas: " + Arrays.toString(this.notas);
    }
}
