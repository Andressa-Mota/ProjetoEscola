package packageEscola;

public class Notas {
    private float notas[];
    private float media;
    private String status;  
    private Estudante estudante;


  
    public Notas(Estudante estudante) { 
        this.notas = new float[3]; 
        this.estudante = estudante;
    }
    public void definirNotas(float nota1, float nota2, float nota3) {
        notas[0] = nota1;
        notas[1] = nota2;
        notas[2] = nota3;
        
        calculaMedia();
        defineStatus();
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
    public String mostraNotas() {
        return "Notas: " + notas[0] + ", " + notas[1] + ", " + notas[2] ;
    }
    
    public void alterarNotas(float nota1, float nota2, float nota3) {
        System.out.println("Alterando as notas do estudante: " + estudante.getNome());
        definirNotas(nota1, nota2, nota3); 
        System.out.println("Notas alteradas com sucesso!");
        System.out.println("Novas notas: " + mostraNotas());
        System.out.println("Nova média: " + getMedia());
        System.out.println("Novo status: " + getStatus());
    }
}
