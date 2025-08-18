package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nota", nullable = false)
    private String nota;

    @ManyToOne
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @OneToMany
    @JoinColumn(name = "disciplina_id", nullable = false)
    private Disciplina disciplina;

    public Avaliacao(Long id, String nota, Aluno aluno, Disciplina disciplina) {
        this.id = id;
        this.nota = nota;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplinas( Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id='" + id + '\'' +
                ", nota='" + nota + '\'' +
                ", aluno=" + aluno +
                ", disciplinas=" + disciplina +
                '}';
    }
}
