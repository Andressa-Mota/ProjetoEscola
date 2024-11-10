package packageEscola;

import java.util.ArrayList;
import java.util.Scanner;


interface Printable {
    void print();
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Professor> professores = new ArrayList<>();
        
        professores.add(new Professor("Luis Araujo", 987654321, "Rua x, 200", 123456789, 5555));
        professores.add(new Professor("Maria Roberta", 123456789, "Rua Z, 300", 987654321, 6666));

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
        Estudante estudante1 = new Estudante("Joao Pereira",0000011, "ruaX",74981100);
        Estudante estudante2 = new Estudante("Ana Costa",0000021, "ruay",74981200);
        Estudante estudante3 = new Estudante("Lucas Almeida",0000031, "ruak",74981300);
        Estudante estudante4 = new Estudante("Laura Santos",0000041, "ruaz",74981400);
        Estudante estudante5 = new Estudante("Pedro Lima",0000051, "ruaX",74981500);

        estudante1.definirNotas(7,3,5);
        estudante1.definirNotas(7,3,5);
        estudante1.definirNotas(7,3,5);
        estudante1.definirNotas(7,3,5);
        estudante1.definirNotas(7,3,5);

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
