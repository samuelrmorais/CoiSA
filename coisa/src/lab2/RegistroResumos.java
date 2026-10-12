package lab2;

import java.util.Arrays;
import java.util.ArrayList;
/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20250029111
 * @author Samuel Roger
 */
public class RegistroResumos {
    private Resumo[] resumos;
    private int quantidadeResumos;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao = 0;
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equalsIgnoreCase(tema)) {
                resumos[i].setConteudo(conteudo);
                return;
            }
        }

        resumos[proximaPosicao] = new Resumo(tema, conteudo);

        if (quantidadeResumos < resumos.length) {
            quantidadeResumos++;
        }

        proximaPosicao = (proximaPosicao + 1) % resumos.length;
    }

    public String[] pegaResumos() {
        String[] resumosAtuais = new String[quantidadeResumos];
        for (int i = 0; i < quantidadeResumos; i++) {
            resumosAtuais[i] = resumos[i].toString();
        }
        return resumosAtuais;
    }

    public String imprimeResumos() {
        String resultado = "- " + quantidadeResumos + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < quantidadeResumos; i++) {
            resultado += resumos[i].getTema();
            if (i < quantidadeResumos - 1) {
                resultado += " | ";
            }
        }
        return resultado;
    }

    public int conta() {
        return this.quantidadeResumos;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        ArrayList<String> temasEncontrados = new ArrayList<>();
        String chave = chaveDeBusca.toLowerCase();

        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                temasEncontrados.add(resumos[i].getTema());
            }
        }

        String[] resultado = temasEncontrados.toArray(new String[0]);
        Arrays.sort(resultado);
        return resultado;
    }
}