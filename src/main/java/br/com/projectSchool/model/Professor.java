package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa{

    @Column(name = "registro_id", nullable = false)
    private String codigoID;

    @ManyToOne
    @JoinColumn(name = "escola_id")
    private Escola escola;

    @ManyToMany
    @JoinTable(
            name = "professor_turma",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "turma_id")
    )
    private List<Turma> turmas = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "professor_disciplina",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, Long id, String codigoID, Escola escola, List<Turma> turmas, List<Disciplina> disciplinas) {
        super(nome, id);
        this.codigoID = codigoID;
        this.escola = escola;
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public String getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(String codigoID) {
        this.codigoID = codigoID;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "codigoID='" + codigoID + '\'' +
                ", escola=" + escola +
                ", turmas=" + turmas +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
