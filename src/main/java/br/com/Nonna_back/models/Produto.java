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

    public String getDescricao(){ return descricao; }


    public BigDecimal getPreco() { return preco; }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria;}


    public Produto (String id, String nome, String descricao, BigDecimal preco, String categoria) {
            this. id = id;
            this.nome= nome;
            this.descricao= descricao;
            this.preco = preco;
            this.categoria = categoria;

        }
}
