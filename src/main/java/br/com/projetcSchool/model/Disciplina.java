package br.com.projetcSchool.model;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private ArrayList<Avaliacao> avaliacaos;

    public Disciplina(String codigo, ArrayList<Aluno> alunos, Professor professor, ArrayList<Avaliacao> avaliacao) {
        this.codigo = codigo;
        this.alunos = alunos;
        this.professor = professor;
        this.avaliacaos = avaliacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(ArrayList<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }

    //Add apenas um aluno
    private void adciocionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void pesquisarAluno(String nome){
        //For()...
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void adiocinarAvaliacao(Avaliacao avaliacao){
        avaliacaos.add(avaliacao);
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                ", avaliacaos=" + avaliacaos +
                '}';
    }
}
