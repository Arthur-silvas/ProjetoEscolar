package br.com.projectSchool.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "avaliacoes")
public class Avaliacao {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "nota")
    private String nota;

    @ManyToOne
    private Aluno aluno;

    @ManyToMany
    @JoinTable(
            name = "avaliacao_disciplina",
            joinColumns = @JoinColumn(name = "avaliacao_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id")
    )
    private List<Disciplina> disciplinas;

    public Avaliacao(String id, String nota, Aluno aluno, List<Disciplina> disciplinas) {
        this.id = id;
        this.nota = nota;
        this.aluno = aluno;
        this.disciplinas = disciplinas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id='" + id + '\'' +
                ", nota='" + nota + '\'' +
                ", aluno=" + aluno +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
