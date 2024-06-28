import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Defina o caminho absoluto para o arquivo CSV
        String caminhoArquivo = "C:\\Users\\emanu\\OneDrive\\Área de Trabalho\\A1-33908389\\A1-\\src\\alunos.csv"; // Ajuste conforme o seu sistema

        List<Aluno> alunos = LeituraArquivo.lerArquivo(caminhoArquivo);
        ProcessamentoDados.processarDados(alunos);
    }
}
