/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.escoladeti2015base.pessoas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Beatrice²
 */
@Component
public class PessoaService {
    
    @Autowired
    private PessoaRepository repo;
    
    public void save(Pessoa p) {
        repo.save(p);
    }
    
    public void remove(Pessoa p) {
        repo.remove(p);
    }

    public Pessoa findById(String id) {
        return repo.findById(id);
    }

    public List<Pessoa> findAll() {
        return repo.findAll();
    }

    void remove(String id) {
        repo.remove(repo.findById(id));
    }
    
}
