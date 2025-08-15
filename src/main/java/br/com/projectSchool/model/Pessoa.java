package br.com.projectSchool.model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@MappedSuperclass
public abstract class Pessoa {

    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nome;

    public Pessoa(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String  toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
