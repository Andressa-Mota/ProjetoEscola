package packageEscola;


class Estudante extends Pessoa implements Printable {
    private float notas[];
    private float media;
    private String status;

    public Estudante(String nome, int CPF, String endereco, int telefone) {
        super(nome, CPF, endereco, telefone);
        this.notas = new float[3]; 
    }

    public void definirNotas(float nota1, float nota2, float nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        
        calculaMedia();
        defineStatus();
    }
    
     public void print() {
        System.out.println("Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public float[] getNotas() {
        return notas;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    private void calculaMedia(){
        media = (notas[0]+notas[1]+notas[2])/3;

    }
    public float getMedia() {
        return media;
    }

    private void defineStatus(){
        if (media <= 2.5){
            status="REPROVADO!";
            return;
        }
                
        if(media < 7){
            status="EM RECUPERAÇÃO!";
            return;
        }
        
        status ="APROVADO!";    
    }

    public String getStatus() {
        return status;
    }
}
