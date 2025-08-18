package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disciplinas")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @ManyToOne()
    @JoinColumn(name = "escola_id")
    private Escola escola;

    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avaliacao> avaliacaos = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "aluno_disciplina",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "aluno_id")
    )
    private List<Aluno> alunos = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "professor_disciplina",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private List<Professor> professor = new ArrayList<>();


    public Disciplina(Long id, String nome, List<Aluno> alunos, List<Professor> professor, List<Avaliacao> avaliacaos) {
        this.id = id;
        this.nome = nome;
        this.alunos = alunos;
        this.professor = professor;
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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
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
