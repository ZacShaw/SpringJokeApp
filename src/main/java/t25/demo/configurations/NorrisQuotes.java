package t25.demo.configurations;

//figure out why this isn't reading
//import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NorrisQuotes {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
    }
}
