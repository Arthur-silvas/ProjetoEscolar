package br.com.projectSchool.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "disciplinas")
public class Disciplina {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nome")
    private String nome;

    @ManyToMany
    @JoinTable(
            name = "aluno_disciplina",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Aluno> alunos;

    @ManyToMany
    @JoinTable(
            name = "professor_disciplina",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private Professor professor;

    @ManyToOne//?
    private List<Avaliacao> avaliacaos;

    public Disciplina(String id, String nome, List<Aluno> alunos, Professor professor, List<Avaliacao> avaliacaos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(List<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                ", avaliacaos=" + avaliacaos +
                '}';
    }
}
