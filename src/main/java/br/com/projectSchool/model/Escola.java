package br.com.projectSchool.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "escolas")
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "codigo_id", nullable = false, unique = true)
    private String codigoId;

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turma> turmas = new ArrayList<>();

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aluno> alunos = new ArrayList<>();

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Professor> professors = new ArrayList<>();

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Disciplina> disciplinas = new ArrayList<>();

    @OneToMany(mappedBy = "escola", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avaliacao> avaliacaos = new ArrayList<>();

    public Escola(String nome, String codigoId) {
        this.nome = nome;
        this.codigoId = codigoId;
    }

    public Escola(String nome, Long id, List<Turma> turmas, List<Aluno> alunos, List<Professor> professors, List<Disciplina> disciplinas, List<Avaliacao> avaliacaos) {
        this.nome = nome;
        this.id = id;
        this.turmas = turmas;
        this.alunos = alunos;
        this.professors = professors;
        this.disciplinas = disciplinas;
        this.avaliacaos = avaliacaos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
