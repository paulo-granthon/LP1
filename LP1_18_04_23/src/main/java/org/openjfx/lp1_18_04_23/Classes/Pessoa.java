package org.openjfx.lp1_18_04_23.Classes;

import java.util.Date;

public class Pessoa {
    String nome;
    String genero;
    Date nascimento;
    public Pessoa (
        String nome,
        String genero,
        Date nascimento
    ) {
        this.nome = nome;
        this.genero = genero;
        this.nascimento = nascimento;
    }
}
