package packageEscola;
import java.util.ArrayList;

class Curso {
    private String nome;
    private int qtdSemestre;
    private ArrayList<Turma> turmas;
    private Professor coordenador;

    public Curso(String nome,int qtdSemestre) {
        this.nome = nome;
        this.qtdSemestre = qtdSemestre;
        this.turmas= new ArrayList<Turma>();
        
    }

    public void vincularCoordenador(Professor coordenador) {
        this.coordenador=coordenador;
    }

    public Professor getCoordenador() {
        return coordenador;
    }
    

    public void adicionarTurma (Turma turma){
        this.turmas.add(turma);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQtdSemestre() {
        return qtdSemestre;
    }
    
    public void setQtdSemestre(int qtdSemestre) {
        this.qtdSemestre = qtdSemestre;
    }
    
    public ArrayList<Turma> getTurmas() {
        return turmas;
    } 

    public void printCoordenador(){
        System.out.println("Coordenador do curso de " +nome);
        System.out.println(coordenador.nome);
    }
}
