
//class Aluno
public class Aluno {
    private String nome;
    private String ra;
    private double[] notas;
    private String modalidade;  // "presencial" ou "ead"
    private double presenca;    // porcentagem de falta

    // Construtor para disciplinas presenciais
    public Aluno(String nome, String ra, double[] notas, double presenca) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = presenca;
        this.modalidade = "presencial";
    }

    // Construtor para disciplinas EAD
    public Aluno(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
        this.presenca = 100;  // EAD, portanto não usa presença
        this.modalidade = "ead";
    }

    // Metodo que calcula a nota com o numero de notas
    public double calcularNotaFinal() {
        int numAvaliacoes = notas.length;
        if (numAvaliacoes == 2) {
            return (notas[0] + notas[1]) / 2.0;  //Calcula a média aritmética
        } else if (numAvaliacoes == 3) {
            return (notas[0] + 2 * notas[1] + 4 * notas[2]) / 7.0;  //Calcula a média ponderada
        } else if (numAvaliacoes == 4) {
            return (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);  // média ponderada conforme pesos
        }
        return 0;
    }

    // Metodo que visualiza a presença do aluno
    public String verificarSituacao() {
        double notaFinal = calcularNotaFinal();
        if (modalidade.equals("presencial")) {
            if (notaFinal >= 5.0 && presenca >= 75.0) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        } else {  // Modalidade EAD
            if (notaFinal >= 5.0) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        }
    }

    // Método para imprimir informações do aluno
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Nota Final: " + calcularNotaFinal());
        System.out.println("Situação: " + verificarSituacao());
    }
}
