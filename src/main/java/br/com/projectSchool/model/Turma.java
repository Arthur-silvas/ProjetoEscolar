package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turmas")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "codigo_id", nullable = false)
    private String codigoID;

    @ManyToOne
    @JoinColumn(name = "escola_id")
    private Escola escola;

    @ManyToMany
    @JoinTable(
            name = "turma_disciplina",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "professor_turma",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "prfessor_id")
    )
    private List<Professor> professors;

    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(Long id, String nome, String codigoID, Escola escola, List<Disciplina> disciplinas, List<Professor> professors, List<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.codigoID = codigoID;
        this.escola = escola;
        this.disciplinas = disciplinas;
        this.professors = professors;
        this.alunos = alunos;
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
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", codigoID='" + codigoID + '\'' +
                ", escola=" + escola +
                ", disciplinas=" + disciplinas +
                ", professors=" + professors +
                ", alunos=" + alunos +
                '}';
    }
}
