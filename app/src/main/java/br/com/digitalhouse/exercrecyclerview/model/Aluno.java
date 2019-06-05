package br.com.digitalhouse.exercrecyclerview.model;

public class Aluno {

    //Atributos
    String nome;
    String curso;
    int foto;

    //Construtor
    public Aluno() {
    }

    public Aluno(String nome, String curso, int foto) {
        this.nome = nome;
        this.curso = curso;
        this.foto = foto;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
