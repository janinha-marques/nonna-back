package br.com.Nonna_back.model;

import java.math.BigDecimal;

public class Produto {
    String id;
    String nome;
    BigDecimal preco;
    String categoria;

        public Produto (String id, String nome, BigDecimal preco, String categoria) {
            this. id = id;
            this.nome= nome;
            this.preco = preco;
            this.categoria = categoria;
        }
}
