package br.com.Nonna_back.Services;

import br.com.Nonna_back.models.Produto;
import br.com.Nonna_back.repositories.ProdutoRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
import java.util.List;
import java.util.UUID;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    ProdutoService(ProdutoRepository repository){
        this.repository = repository;
    }

    public List<Produto> getTodosProdutos(){
        return this.repository.getTodosProduto();
    }

    public  Produto getProduto(String id){

        validarId(id);

            return this.repository.getTodosProduto(id);
        }

    public void criarProduto(Produto produto){
            produto.setId("");


        if (produto.getNome() == null || produto.getNome().isEmpty()){
            throw  new IllegalArgumentException("Id não pode ser vazio"){

            }
            produto.setNome(produto.getNome().trim());

            public void deleteProduto(String id{
                validarProduto(id);
                this.repository.getTodosProduto(id);
                this.repository.deleteProduto(id);
            })

            private void validarProduto(String id){

            }

        boolean idValido = false;
            try
            {
            if (UUID.fromString(id).toString().equals(id)){
                idValido = true;

            }

            }catch (Exception ex){
                idValido = false;
            }

            if (!idValido){
                throw  new IllegalArgumentException("Id inválido");

            }
                return this.repository.getProduto(id);

            try {
                return  this.repository.getProduto(id);
            } catch (EmptyResultDataAccessException exception){
                throw  new IllegalArgumentException("Produto não encontrado!");

       }

        public void criarProduto(Produto produto) {
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




