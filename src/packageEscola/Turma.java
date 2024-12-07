package packageEscola;

import java.util.List;
import java.util.ArrayList;

class Turma {
    private String nome;
    private List<Professor> professores;
    private List<Estudante> estudantes;
    private Curso curso;
    private int contAprovado, contReprovado, contRecuperacao;

    public Turma(String nome,  Curso curso) {
        this.nome = nome;
        this.curso = curso;
       
        
        this.estudantes = new ArrayList<Estudante>();
        this.professores = new ArrayList<Professor>();
    }

    public void vincularProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstatistica() {
        for (Estudante estudante : estudantes) {
            if (estudante.getStatus() == "REPROVADO!") {
                contReprovado++;

            }
            if (estudante.getStatus() == "APROVADO!") {
                contAprovado++;
            }
            if (estudante.getStatus() == "EM RECUPERAÇÃO!") {
                contRecuperacao++;
            }

        }
    }

    public void printEstatistica(){
        System.out.println(contAprovado + " Alunos Aprovados");
        System.out.println(contReprovado + " Alunos Reprovados");
        System.out.println(contRecuperacao + " Alunos em Recuperação");

    }

    public void printInfoturmas(){
        System.out.println("ESTUDANTES:");
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante vinculado.");
        } else {
            for (Estudante estudante : estudantes) {
                System.out.println(" - " + estudante.getNome());
            }
        }

        System.out.println("PROFESSOR:");
    if (professores.isEmpty()) {
        System.out.println("Nenhum professor vinculado.");
    } else {
        for (Professor professor : professores) {
            System.out.println(" - " + professor.nome);
        }
    }

    }

    public  void listarEstudantesPorStatus( String statusDesejado) {
        System.out.println("Estudantes com status: " + statusDesejado);
        for (Estudante estudante : estudantes) {
            if (estudante.getStatus().equals(statusDesejado)) {
                System.out.println(" - " + estudante.getNome() + " | " + estudante.mostraNotas() + " | Média: " + estudante.getMedia());
            }
        }
        System.out.println();
    }


}
