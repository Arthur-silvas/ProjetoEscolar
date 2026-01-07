package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa{

    @Column(name = "matricula", nullable = false)
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "escola_id")
    private Escola escola;

    @ManyToOne //muitos alunos para uma turma
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @ManyToMany //Muitos alunos para muitas disciplinas
    @JoinTable(
            name = "aluno_disciplina",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas = new ArrayList<>();


    public Aluno(String nome, Long id, String matricula, Escola escola, Turma turma, List<Disciplina> disciplinas) {
        super(nome, id);
        this.matricula = matricula;
        this.escola = escola;
        this.turma = turma;
        this.disciplinas = disciplinas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
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
                "matricula='" + matricula + '\'' +
                ", escola=" + escola +
                ", turma=" + turma +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
