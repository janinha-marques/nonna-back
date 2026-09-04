package br.com.Nonna_back.Services;

import br.com.Nonna_back.models.Produto;
import br.com.Nonna_back.repositories.ProdutoRepository;
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
}




