package br.com.Nonna_back.models;

import java.math.BigDecimal;

public class Produto {
    String id;
    String nome;
    String descricao;
    BigDecimal preco;
    String categoria;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public Produto (String id, String nome, String descricao, BigDecimal preco, String categoria) {
            this. id = id;
            this.nome= nome;
            this.preco = preco;
            this.categoria = categoria;

        }
}
