package packageEscola;
interface Printable {
    void print();
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Luis Araujo",0000001, "ruaX",7498100,001 );
        Professor professor2 = new Professor("Maria Oliveira",0000002, "ruay",7499100,002);
        
        professor1.print();
        professor2.print();
 
        Estudante estudante1 = new Estudante("Joao Pereira",0000011, "ruaX",74981100);
        Estudante estudante2 = new Estudante("Ana Costa",0000021, "ruay",74981200);
        Estudante estudante3 = new Estudante("Lucas Almeida",0000031, "ruak",74981300);
        Estudante estudante4 = new Estudante("Laura Santos",0000041, "ruaz",74981400);
        Estudante estudante5 = new Estudante("Pedro Lima",0000051, "ruaX",74981500);
    
        estudante1.print();
        estudante2.print();
        estudante3.print();
        estudante4.print();
        estudante5.print();
     
        Curso curso1 = new Curso("Licenciatura",2);
        Curso curso2 = new Curso("Computacao",10);
        
        Turma turma1 = new Turma("Turma A", curso1);
        Turma turma2 = new Turma("Turma B",curso2);

        turma1.adicionarEstudante(estudante1);
        turma1.adicionarEstudante(estudante2);
        turma2.adicionarEstudante(estudante3);
        turma2.adicionarEstudante(estudante4);
        turma2.adicionarEstudante(estudante5);
        
        curso1.adicionarTurma(turma1);
        curso2.adicionarTurma(turma2);
    }
}
