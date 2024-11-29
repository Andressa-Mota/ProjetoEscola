package packageEscola;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Professor> professores = new ArrayList<>();
        
        professores.add(new Professor("Luis Araujo", 987654321, "Rua x, 200", 123456789, 5555));
        professores.add(new Professor("Maria Roberta", 123456789, "Rua Z, 300", 987654321, 6666));
        System.out.println("Professores Adicionados...");

        System.out.println("Lista de Professores:");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println((i + 1) + ". " + professores.get(i).nome);
        }

        System.out.print("Escolha o número do professor para definir como coordenador: ");

        if (scanner.hasNextInt()) {
            int escolha = scanner.nextInt();

           
            if (escolha > 0 && escolha <= professores.size()) {
            
                Professor professorEscolhido = professores.get(escolha - 1);
                professorEscolhido.setcoordenador(true);
                System.out.println(professorEscolhido.nome + " agora é o coordenador.");
            } else {
                System.out.println("Escolha inválida! Escolha um número entre 1 e " + professores.size());
            }
        } else {
            System.out.println("Entrada inválida! Por favor, insira um número.");
        }

        
        System.out.println("\nStatus Atualizado dos Professores:");
        for (Professor professor : professores) {
            professor.print();
        }
        scanner.close();

        System.out.println("_____________________________________");
        ArrayList<Estudante> estudantes = new ArrayList<>();
        
        estudantes.add(new Estudante("Joao Pereira",0000011, "ruaX",74981100));
        estudantes.add(new Estudante("Ana Costa",0000021, "ruay",74981200));
        estudantes.add(new Estudante("Lucas Almeida",0000031, "ruak",74981300));
        estudantes.add(new Estudante("Laura Santos",0000041, "ruaz",74981400));
        estudantes.add(new Estudante("Pedro Lima",0000051, "ruaX",74981500));
        System.out.println("Alunos Adicionados...");


        estudantes.get(0).definirNotas(3f,2f,1f);
        estudantes.get(1).definirNotas(2f,5f,6f);
        estudantes.get(2).definirNotas(5f,5f,3f);
        estudantes.get(3).definirNotas(1f,4f,7f);
        estudantes.get(4).definirNotas(81f,6f,7f);
        System.out.println("_____________________________________");
        System.out.println("Lista Geral de Estudantes:");
        for (Estudante estudante : estudantes){
            System.out.println(estudante.getNome());
            System.out.println("Média: "+estudante.getMedia());
            System.out.println("Satus: "+estudante.getStatus());
            
        }
        System.out.println("Média e Status dos alunos adicionados...");

        
        Curso curso1 = new Curso("Licenciatura",2);
        Curso curso2 = new Curso("Computacao", 10);

        Turma turma1 = new Turma("Turma A", curso1);
        Turma turma2 = new Turma("Turma B", curso2);
          

        turma1.adicionarEstudante(estudantes.get(0));
        turma1.adicionarEstudante(estudantes.get(1));
        turma2.adicionarEstudante(estudantes.get(2));
        turma2.adicionarEstudante(estudantes.get(3));
        turma2.adicionarEstudante(estudantes.get(4));

        turma1.vincularProfessor(professores.get(0));
        turma2.vincularProfessor(professores.get(1));

        turma1.setEstatistica(); 
        turma2.setEstatistica(); 
        System.out.println("_____________________________________");
        System.out.println("Status dos Estudantes da TURMA 1:");
        turma1.printEstatistica();
        System.out.println();
        System.out.println("Status dos Estudantes da TURMA 2:");
        turma2.printEstatistica();
        
        curso1.adicionarTurma(turma1);
        curso2.adicionarTurma(turma2);

        System.out.println("_____________________________________");
        System.out.println("Informaçõs das turmas:");
        System.out.println("TURMA 1");
        turma1.printInfoturmas();
        System.out.println();
        System.out.println("TURMA 2");
        turma2.printInfoturmas();
    }
}
