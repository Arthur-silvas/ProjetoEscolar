package br.com.projectSchool;

import br.com.projectSchool.model.Escola;
import br.com.projectSchool.model.Turma;

public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola de Desenvolvimento de Software","EDS-2024");
        Turma turma = new Turma("Primeiro Ano B", "1B-2024");
        turma.setEscola(escola);
    }
}