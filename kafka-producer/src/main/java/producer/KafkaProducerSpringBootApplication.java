package producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import producer.service.WikimediaChangeProducer;

@SpringBootApplication
public class KafkaProducerSpringBootApplication implements CommandLineRunner {
    public static void main( String[] args )
    {

        SpringApplication.run(KafkaProducerSpringBootApplication.class, args);
    }

    @Autowired
    private WikimediaChangeProducer kafkaChangeProducer;


    @Override
    public void run(String... args) throws Exception {
        kafkaChangeProducer.sendMessage();
    }
}
