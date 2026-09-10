package br.com.Nonna_back.Services;

import br.com.Nonna_back.models.Produto;
import br.com.Nonna_back.repositories.ProdutoRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public List<Produto> getTodosProdutos(){
        return this.repository.getTodosProdutos();
    }

    public  void criarProduto(Produto produto) {
        produto.setId(""); // VERIFICAR SE NÃO DÁ ERRO


        if (produto.getNome() == null || (produto.getNome().trim()).isEmpty()){
             throw new IllegalArgumentException("Nome não pode ser vazio!");
    }

    produto.setNome(produto.getNome(). trim());

        if(produto.getDescricao() == null|| (produto.getDescricao().trim()).isEmpty()){
            throw  new IllegalArgumentException("Descrição não ´pode se vazio!");

        }
        if(produto.getPreco() == null || produto.getPreco().intValue() <= 0){
            throw new IllegalArgumentException("Preço deve ser maior que 0!");

        }
        if(produto.getCategoria()== null || (produto.getCategoria().trim().isEmpty())){

        }
        produto.setCategoria(produto.getCategoria().trim());


    }

}




