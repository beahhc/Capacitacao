package cor;

import java.util.List;

public interface CorRepository {
    
    void save(Cor c);
    void remove(Cor c);
    Cor findById(String id);
    List<Cor> findAll();
    
}
