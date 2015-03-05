package cor;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorService {
    
    @Autowired
    private CorRepository repo;
    
    public void save(Cor c) {
        repo.save(c);
    }
    
    public void remove(Cor c) {
        repo.remove(c);
    }

    public Cor findById(String id) {
        return repo.findById(id);
    }

    public List<Cor> findAll() {
        return repo.findAll();
    }

    void remove(String id) {
        repo.remove(repo.findById(id));
    }
    
    
}
