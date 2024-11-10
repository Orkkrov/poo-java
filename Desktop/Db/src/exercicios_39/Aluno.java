package exercicios_39;

public class Aluno {
    private long matricula;
    private String nome;
    private String disciplina;
    private int numeroAulas;
    private int numeroFaltas;
    private int faltasPermitidas;
    private double notaAV1;
    private double notaAV2;
    private boolean situacao;

    public boolean isSituacao() {
        return situacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getFaltasPermitidas() {
        return faltasPermitidas;
    }

    public void setFaltasPermitidas(int faltasPermitidas) {
        this.faltasPermitidas = faltasPermitidas;
    }

    private double notaAV3;
    private double media;


    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getdisciplina() {
        return disciplina;
    }

    public void setdisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        this.numeroFaltas = numeroFaltas;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public double getNotaAV3() {
        return notaAV3;
    }

    public void setNotaAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
    }



    public Aluno( String nome, String disciplina, int numeroAulas, int numeroFaltas, int faltasPermitidas, double notaAV1, double notaAV2, double notaAV3, double media) {

        this.nome = nome;
        this.disciplina = disciplina;
        this.numeroAulas = numeroAulas;
        this.numeroFaltas = numeroFaltas;
        this.faltasPermitidas = faltasPermitidas;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAV3 = notaAV3;
        this.media = media;
    }

    public double calcularMedia(){
         media = 0;

        if (notaAV1 < notaAV2 && notaAV1 < notaAV3){
            media = (notaAV2 + notaAV3)/2;
        }else if (notaAV2 < notaAV3 && notaAV2 < notaAV1){
            media = (notaAV1 + notaAV3)/2;
        }else if (notaAV3 < notaAV2 && notaAV3 < notaAV1){
            media = (notaAV2 + notaAV1)/2;
        }

        return media;
    }

    public int calcularLimiteFaltas(){

        faltasPermitidas =   numeroAulas / 25;

        return faltasPermitidas;


    }

    public void verificarSituacao(double media, int numeroFaltas){

        this.media = media;
        this.numeroFaltas = numeroFaltas;

        if (media >= 6 && numeroFaltas < faltasPermitidas  ){
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");

        }


    }




}
