package br.com.api.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.model.ProdutoModel;
import br.com.api.produtos.model.RespostaModel;
import br.com.api.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private RespostaModel respostaModel;

    public Iterable<ProdutoModel> listar() {
        return produtoRepository.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(ProdutoModel produto, String acao) {
        if(produto.getNome().equals("")) {
            respostaModel.setMensagem("O nome do produto é obrigatório.");
            return new ResponseEntity<RespostaModel>(respostaModel, HttpStatus.BAD_REQUEST);
        }else if (produto.getMarca().equals("")) {
            respostaModel.setMensagem("O nome da marca é obrigatório.");
            return new ResponseEntity<RespostaModel>(respostaModel, HttpStatus.BAD_REQUEST);

        }else{
            if(acao.equals("cadastrar")) {
                return new ResponseEntity<ProdutoModel>(produtoRepository.save(produto), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<ProdutoModel>(produtoRepository.save(produto), HttpStatus.OK);
            }
        }
    }

    public ResponseEntity<RespostaModel> remover(long codigo) {
        produtoRepository.deleteById(codigo);

        respostaModel.setMensagem("O produto foi removido com sucesso.");
        return new ResponseEntity<RespostaModel>(respostaModel, HttpStatus.OK);
    }
}
