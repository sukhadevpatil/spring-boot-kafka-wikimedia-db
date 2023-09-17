package producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerSpringBootApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(KafkaProducerSpringBootApplication.class, args);
    }
}
