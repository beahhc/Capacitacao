/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import java.util.List;

/**
 *
 * @author Beatrice²
 */
public interface PessoaRepository {
    void save(Pessoa p);
    void remove(Pessoa p);
    Pessoa findById(String id);
    List<Pessoa> findAll();
    
}
