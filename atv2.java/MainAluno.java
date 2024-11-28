


public class MainAluno {
    public static void main(String[] args) {
        // Criando um objeto da classe AlunoBug
        AlunoBug aluno = new AlunoBug(12345, "João Silva", 18, 7.5, 8.0);
        
        // Exibindo informações do aluno
        aluno.exibirInfo();
        
        // Alterando as notas e exibindo novamente
        aluno.setNota1(9.0);
        aluno.setNota2(10.0);
        aluno.exibirInfo();
    }
}