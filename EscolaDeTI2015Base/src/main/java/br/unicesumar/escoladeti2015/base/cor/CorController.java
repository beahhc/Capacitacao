/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unicesumar.escoladeti2015.base.cor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping(value = "/cores")
 public class CorController {
    
    @Autowired
    private CorService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cor getCor(@PathVariable String id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cor> getCores() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void criarCor(@RequestBody Cor cor) {
        service.save(cor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void excluirCor(@PathVariable String id) {
        service.remove(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void atualizarCor(@PathVariable String id, @RequestBody Cor cor) {
        service.remove(id);
        service.save(cor);
    }
}
