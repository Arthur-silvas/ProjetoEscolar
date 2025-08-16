package br.com.projectSchool.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "escolas")
public class Escola {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nome")
    private String nome;

    @OneToMany
    private List<Turma> turmas;

    @OneToMany
    private List<Aluno> alunos;

    private List<Professor> professors;
    private List<Disciplina> disciplinas;
    private List<Avaliacao> avaliacaos;

    public Escola(String nome, String id, List<Turma> turmas, List<Aluno> alunos, List<Professor> professors, List<Disciplina> disciplinas, List<Avaliacao> avaliacaos) {
        this.nome = nome;
        this.id = id;
        this.turmas = turmas;
        this.alunos = alunos;
        this.professors = professors;
        this.disciplinas = disciplinas;
        this.avaliacaos = avaliacaos;
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

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(List<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", codigoID='" + id + '\'' +
                ", turmas=" + turmas +
                ", alunos=" + alunos +
                ", professors=" + professors +
                ", disciplinas=" + disciplinas +
                ", avaliacaos=" + avaliacaos +
                '}';
    }
}
