package packageEscola;
import java.util.List;
import java.util.ArrayList;

class Turma {
    private String nome;
    private List<Professor> professores;
    private Professor professor;
    private List<Estudante> estudantes;
    private Curso curso;
    
    public Turma(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
        this.estudantes = new ArrayList<Estudante>();
        this.professores = new ArrayList<Professor>();
    }
    
    public void vincularProfessor(Professor professor){
        this.professor = professor;
    }
    
    public void adicionarEstudante(Estudante estudante){
        this.estudantes.add(estudante);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome=nome;
    } 
    
    public List<Professor> getProfessores() {
        return professores;
    }
    
    public List<Estudante> getEstudantes() {
        return estudantes;
    } 
}



