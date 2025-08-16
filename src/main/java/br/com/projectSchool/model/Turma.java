package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "turmas")
public class Turma {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nome")
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "turma_disciplina",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    @ManyToMany
    @JoinTable(
            name = "professor_turma",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "prfessor_id")
    )
    private List<Professor> professors;

    @OneToMany
    private List<Aluno> alunos;

    public Turma(String id, String nome, List<Disciplina> disciplinas, List<Professor> professors, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.professors = professors;
        this.alunos = alunos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", codigoID='" + id + '\'' +
                ", disciplinas=" + disciplinas +
                ", professors=" + professors +
                ", alunos=" + alunos +
                '}';
    }
}
