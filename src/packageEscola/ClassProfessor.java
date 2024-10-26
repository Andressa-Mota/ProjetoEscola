package packageEscola;
class Professor extends Pessoa {
    private int SIAP;

    public Professor(String nome, int CPF, String endereco, int telefone, int SIAP) {
        super(nome, CPF, endereco, telefone);
        this.SIAP = SIAP;
    }
    
     public void print() {
        System.out.println("Professor:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("SIAP: " + SIAP);
    }
    
    public int getSIAP() {
        return SIAP;
    }

    public void setSIAP(int SIAP) {
        this.SIAP = SIAP;
    }
}
