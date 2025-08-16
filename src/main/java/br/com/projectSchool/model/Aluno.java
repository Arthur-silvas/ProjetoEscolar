package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa{

    @ManyToOne //muitos alunos para uma turma
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ManyToMany //Muitos alunos para muitas disciplinas
    @JoinTable(
            name = "aluno_disciplina",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    public Aluno(String nome, String id, Turma turma, List<Disciplina> disciplinas) {
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
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
