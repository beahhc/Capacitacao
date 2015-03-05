/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.escoladeti2015.base.cor;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CorRepositoryInMemory implements CorRepository{
    
    private List<Cor> listaDeCores;

    public CorRepositoryInMemory() {
        this.listaDeCores = new ArrayList<Cor>();
    }        

    @Override
    public void save(Cor c) {
        if (!listaDeCores.contains(c)) {
            listaDeCores.add(c);
        } else {
            throw new RuntimeException("Cor duplicada!");
        }
    }

    @Override
    public void remove(Cor c) {
        listaDeCores.remove(c);
    }

    @Override
    public Cor findById(String id) {
        for (Cor cor : listaDeCores) {
            if (cor.getId().equals(id)) {
                return cor;
            }
        }
        return null;
    }

    @Override
    public List<Cor> findAll() {
        return Collections.unmodifiableList(listaDeCores);
    }
    
}
