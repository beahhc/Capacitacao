/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.escoladeti2015base.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Beatrice²
 */
public class PessoaRepositoryInMemory implements PessoaRepository{
    private List<Pessoa> listaDePessoas;
    
    public PessoaRepositoryInMemory(){      
        this.listaDePessoas = new ArrayList<Pessoa>();
    }
    @Override
    public void save(Pessoa p) {
        if (!listaDePessoas.contains(p)) {
            listaDePessoas.add(p);
        }
    }

    @Override
    public void remove(Pessoa p) {
        listaDePessoas.remove(p);
    }

    @Override
    public Pessoa findById(String id) {
        for (Pessoa p: listaDePessoas) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Pessoa> findAll() {
        return Collections.unmodifiableList(listaDePessoas);
    }
    
}
