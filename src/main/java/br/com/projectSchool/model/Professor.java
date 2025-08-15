package br.com.projectSchool.model;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, String id, ArrayList<Turma> turmas, ArrayList<Disciplina> disciplinas) {
        super(nome, id);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "turmas=" + turmas +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
