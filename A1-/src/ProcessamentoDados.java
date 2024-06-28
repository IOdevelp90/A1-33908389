import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProcessamentoDados {
    public static void processarDados(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno foi encontrado. Verifique se o arquivo foi lido corretamente.");
            return;
        }

        int totalAlunos = alunos.size();
        int aprovados = 0;
        int reprovados = 0;
        double menorNota = Double.MAX_VALUE;
        double maiorNota = Double.MIN_VALUE;
        double somaNotas = 0.0;

        for (Aluno aluno : alunos) {
            double media = aluno.getMedia();
            System.out.println("Processando aluno: " + aluno.getNome() + " - Média: " + media); // Adicionado para debug
            somaNotas += media;
            if (media >= 6.0) {
                aprovados++;
            } else {
                reprovados++;
            }
            if (media < menorNota) {
                menorNota = media;
            }
            if (media > maiorNota) {
                maiorNota = media;
            }
        }

        double mediaGeral = somaNotas / totalAlunos;

        System.out.println("Quantidade de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Média geral: " + mediaGeral);

        gravarResumo(totalAlunos, aprovados, reprovados, menorNota, maiorNota, mediaGeral);
    }

    public static void gravarResumo(int total, int aprovados, int reprovados, double menorNota, double maiorNota, double mediaGeral) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("resumo.csv"))) {
            bw.write("Total de alunos," + total + "\n");
            bw.write("Aprovados," + aprovados + "\n");
            bw.write("Reprovados," + reprovados + "\n");
            bw.write("Menor nota," + menorNota + "\n");
            bw.write("Maior nota," + maiorNota + "\n");
            bw.write("Média geral," + mediaGeral + "\n");
            System.out.println("Resumo gravado com sucesso em resumo.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
