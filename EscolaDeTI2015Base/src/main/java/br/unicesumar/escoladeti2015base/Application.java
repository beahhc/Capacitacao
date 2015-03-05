package br.unicesumar.escoladeti2015base;
import br.unicesumar.escoladeti2015base.pais.PaisRepository;
import br.unicesumar.escoladeti2015base.pais.PaisRepositoryInMemory;
import cor.CorRepository;
import cor.CorRepositoryInMemory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import br.unicesumar.escoladeti2015base.pessoas.PessoaRepository;
import br.unicesumar.escoladeti2015base.pessoas.PessoaRepositoryInMemory;

@SpringBootApplication
public class Application {
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);        
    
    }
    
    @Bean
    public CorRepository criarCorRepository() {
        return new CorRepositoryInMemory();
    }
    
    @Bean 
    public PaisRepository criarPaisRepository() {
        return new PaisRepositoryInMemory();
    }
    
    @Bean 
    public PessoaRepository criarPessoaRepository() {
        return new PessoaRepositoryInMemory();
    }
}