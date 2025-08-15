package br.com.projectSchool.model;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Turma turma;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, String id, Turma turma, ArrayList<Disciplina> disciplinas) {
        super(nome, id);
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "turma=" + turma +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
