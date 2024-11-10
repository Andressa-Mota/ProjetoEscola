package packageEscola;
class Professor extends Pessoa implements Printable {
    private int SIAP;
    private boolean Coordenador;

    public Professor(String nome, int CPF, String endereco, int telefone, int SIAP) {
        super(nome, CPF, endereco, telefone);
        this.SIAP = SIAP;
        this.Coordenador = false;
    }
    
     public void print() {
        System.out.println("Professor:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("SIAP: " + SIAP);
        System.out.println("Coordenaor: " + (Coordenador ? "Sim" : "Não"));
    }
    
    public int getSIAP() {
        return SIAP;
    }

    public void setSIAP(int SIAP) {
        this.SIAP = SIAP;
    }

    public boolean Coordenador() {
        return Coordenador;
    }

    public void setcoordenador(boolean Coordenador) {
        this.Coordenador = Coordenador;
    }
}
