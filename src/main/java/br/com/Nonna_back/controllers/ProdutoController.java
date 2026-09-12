package br.com.Nonna_back.controllers;


import br.com.Nonna_back.models.Produto;
import br.com.Nonna_back.Services.ProdutoService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {
    private final ProdutoService service;

    ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping()
    List<Produto> getTodosprtodutos() {
        return this.service.getTodosProdutos();
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getProduto(@PathVariable String id) {
        try {
            Produto produto = this.service.getProdutos(id);
            return ResponseEntity.status(HttpStatus.OK).body(produto);
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("error", exception.getMessage()));
        } catch (EmptyResultDataAccessException exception) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("error", "Produto não encontrado!"));
        }

    }

    @PostMapping()
    public ResponseEntity<?> criarProduto(@RequestBody Produto produto) {
        try {
            this.service.criarProduto(produto);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("erro", exception.getMessage()));
        }
    }

    @PutMapping("/{id}")
    ResponseEntity<?> atualizarProduto(@PathVariable String id.@RequestBody Produto produto);
           this.service.atualizarProduto(id, produto);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
} @GetMapping("/{id}")
public ResponseEntity<?> atualizarProduto(@PathVariable String id, @RequestBody Produto produto) {
    try {
       this.service.atualizarProdutos(id, produto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    } catch (IllegalArgumentException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(Map.of("error", exception.getMessage()));
    } catch (EmptyResultDataAccessException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", "Produto não encontrado!"));


