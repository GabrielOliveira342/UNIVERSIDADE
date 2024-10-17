//class main 
public class Main {

	public static void main(String[] args) {
		 // Imprimindo os valores seguindo os parametros 
        double[] notasPresencial = {7.5, 8.0, 9.0, 6.5};  // calculando a média ponderada
        Aluno alunoPresencial = new Aluno("Gabriel", "248309", notasPresencial, 80.0);
        alunoPresencial.imprimirInformacoes();

        System.out.println();  

        // Imprimindo os valores seguindo os parametros, em EAD
        double[] notasEad = {5.0, 3.0, 5};  // calculando a média ponderada
        Aluno alunoEad = new Aluno("Bruno", "67890", notasEad);
        alunoEad.imprimirInformacoes();
	}

}
