package com.stackroute.muzix.config;


import com.stackroute.muzix.model.Muzix;
import com.stackroute.muzix.repository.MuzixRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackageClasses = MuzixRepository.class)
@Configuration
public class MuzixConfig
{

    @Bean
    CommandLineRunner commandLineRunner(MuzixRepository muzixRepository)
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception
            {
                muzixRepository.save(new Muzix(1,"The Less I Know the Better","Tame Impala","https://www.last.fm/music/Tame+Impala/_/The+Less+I+Know+the+Better"));
                muzixRepository.save(new Muzix(2,"Creep","Radiohead","https://www.last.fm/music/Radiohead/_/Creep"));


            }
        };
    }

}
