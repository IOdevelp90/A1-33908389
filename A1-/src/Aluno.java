
public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        if (nota2 == -1) {
            return nota1;
        } else {
            return (nota1 + nota2) / 2.0;
        }
    }
}
