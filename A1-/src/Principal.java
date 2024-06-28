import java.util.List; // Importação para List
import java.util.ArrayList; // Importação para ArrayList

public class Principal {
    public static void main(String[] args) {
        // Verifique o caminho correto para o arquivo CSV
        String caminhoArquivo = "alunos.csv";

        // Certifique-se de que LeituraArquivo está no mesmo pacote ou importe corretamente
        List<Aluno> alunos = LeituraArquivo.lerArquivo(caminhoArquivo);

        // Certifique-se de que ProcessamentoDados está no mesmo pacote ou importe corretamente
        ProcessamentoDados.processarDados(alunos);
    }
}
