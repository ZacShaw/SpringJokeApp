package t25.demo.services;

import org.springframework.stereotype.Service;
//figure out why this isn't reading
//import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ServiceImplementation {
    @Service
    public class JokeServiceImplementation implements JokeService
    {

        //declare variable
        //private final ChuckNorrisQuotes chuck_norris_quotes;

        //Setter Goes here


        @Override
        public String getJoke()
        {
            //get random quote working somehow
            //return chuck_norris_quotes.getRandomQuote();
        }
    }
}
