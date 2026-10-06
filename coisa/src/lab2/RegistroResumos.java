package lab2;

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
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(quantidadeResumos).append(" resumo(s) cadastrado(s)\n");
        sb.append("- ");

        for (int i = 0; i < quantidadeResumos; i++) {
            sb.append(temas[i]);
            if (i < quantidadeResumos - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
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