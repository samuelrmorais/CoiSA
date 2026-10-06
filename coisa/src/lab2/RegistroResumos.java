package lab2;
/**
 * Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 * 20250029111
 * @author Samuel Roger
 */
public class RegistroResumos {
    private String[] temas;
    private String[] resumos;
    private int quantidadeResumos;
    private int proximaPosicao;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao = 0;
    }

    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (temas[i].equalsIgnoreCase(tema)) {
                resumos[i] = tema + ": " + conteudo;
                return;
            }
        }

        temas[proximaPosicao] = tema;
        resumos[proximaPosicao] = tema + ": " + conteudo;

        if (quantidadeResumos < temas.length) {
            quantidadeResumos++;
        }

        proximaPosicao = (proximaPosicao + 1) % temas.length;
    }

    public String[] pegaResumos() {
        String[] resumosAtuais = new String[quantidadeResumos];
        for (int i = 0; i < quantidadeResumos; i++) {
            resumosAtuais[i] = resumos[i];
        }
        return resumosAtuais;
    }

    public String imprimeResumos() {
        String resultado = "- " + quantidadeResumos + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < quantidadeResumos; i++) {
            resultado += temas[i];
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
            if (temas[i].equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }
}