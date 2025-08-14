package br.com.projetcSchool.model;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String codigoID;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professors;
    private ArrayList<Aluno> alunos;

    public Turma(String nome, String codigoID, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professors, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.codigoID = codigoID;
        this.disciplinas = disciplinas;
        this.professors = professors;
        this.alunos = alunos;
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

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", codigoID='" + codigoID + '\'' +
                ", disciplinas=" + disciplinas +
                ", professors=" + professors +
                ", alunos=" + alunos +
                '}';
    }
}
