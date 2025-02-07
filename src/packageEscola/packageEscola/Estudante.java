package packageEscola;


class Estudante extends Pessoa implements Printable {
    private Notas notas;

    public Estudante(String nome, int CPF, String endereco, int telefone) {
        super(nome, CPF, endereco, telefone);
        this.nome=nome;
        this.notas = new Notas(this);
    }


     public void print() {
        System.out.println("Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }
}
