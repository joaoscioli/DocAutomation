package example_test_excel;

public class Aluno {
    private String nome;
    private String ra;
    private double nota_1;
    private double nota_2;
    private double media;
    private boolean aprovado;

    public Aluno(String nome, String ra, double nota_1, double nota_2) {
        super();
        this.nome = nome;
        this.ra = ra;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.media = (nota_1 + nota_2) / 2;
        this.aprovado = media >= 6;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
