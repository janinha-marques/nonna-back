package br.com.Nonna_back.repositories;

import br.com.Nonna_back.models.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class ProdutoRepository {

    private final JdbcTemplate jdbcTemplate;

    ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Produto> getTodosProduto() {
        return jdbcTemplate.query(
                "SELECT id, nome, descricao, preco, categoria FROM produto ",
                (ResultSet resultado, int linha) -> new Produto(
                        resultado.getString("id"),
                        resultado.getString("nome"),
                        resultado.getString("descricao"),
                        resultado.getBigDecimal("preco"),
                        resultado.getString("categoria")
                )

        );

    }
        public Produto getTodosProduto(String id){
            return jdbcTemplate.queryForObject(
                    "SELECT id, nome, descricao, preco, categoria FROM produto WHERE id = ? ",
                    (ResultSet resultado, int numLlinha) -> new Produto(
                            resultado.getString( "id"),
                            resultado.getString( "nome"),
                            resultado.getString("descricao"),
                            resultado.getBigDecimal("preco"),
                            resultado.getString("categoria")

                ),  id
    );
}
        public void criaProduto(Produto produto){
            jdbcTemplate.update(
            "INSERT INTO produto(nome, descricao, preco, categoria) VALUES (????)",
            produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getCategoria()
        );
    }

    public void atualizarProduto(String id, Produto produto){
        jdbcTemplate.update(
                "UPDATE produto SET nome = ?, descricao = ?, preco =?, categoria = ? WHERE id = ?",
                produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getCategoria(), id

        );

    }
    public void deleteProduto(String id){
        jdbcTemplate.update( "DELETE FROM  produto WHERE id = ?", id);
    }

}
