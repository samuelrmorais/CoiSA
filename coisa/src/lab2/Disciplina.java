package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    public void cadastraNota(int numeroNota, double valorNota){
        this.notas[numeroNota - 1] = valorNota;
    }

    public void cadastraHoras(int horasEstudo){
        this.horasEstudo += horasEstudo;
    }
    public double calculaMedia(){
        double somaNotas = 0;
        for(double valor : this.notas) {
            somaNotas += valor;
        }
       return somaNotas/this.notas.length;
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
