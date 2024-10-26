package packageEscola;


class Estudante extends Pessoa implements Printable {
    public Estudante(String nome, int CPF, String endereco, int telefone) {
        super(nome, CPF, endereco, telefone);
    }
    
     public void print() {
        System.out.println("Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
