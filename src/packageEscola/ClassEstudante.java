package packageEscola;


class Estudante extends Pessoa implements Printable {
    private float notas[];

    public Estudante(String nome, int CPF, String endereco, int telefone) {
        super(nome, CPF, endereco, telefone);
        this.notas = new float[3]; 
    }

    public void definirNotas(float nota1, float nota2, float nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
    }
    
     public void print() {
        System.out.println("Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
