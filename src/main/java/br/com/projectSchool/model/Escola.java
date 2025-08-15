package br.com.projectSchool.model;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String codigoID;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professors;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Avaliacao> avaliacaos;

    public Escola(String nome, String codigoID, ArrayList<Turma> turmas, ArrayList<Aluno> alunos, ArrayList<Professor> professors, ArrayList<Disciplina> disciplinas, ArrayList<Avaliacao> avaliacaos) {
        this.nome = nome;
        this.codigoID = codigoID;
        this.turmas = turmas;
        this.alunos = alunos;
        this.professors = professors;
        this.disciplinas = disciplinas;
        this.avaliacaos = avaliacaos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(ArrayList<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", codigoID='" + codigoID + '\'' +
                ", turmas=" + turmas +
                ", alunos=" + alunos +
                ", professors=" + professors +
                ", disciplinas=" + disciplinas +
                ", avaliacaos=" + avaliacaos +
                '}';
    }
}
