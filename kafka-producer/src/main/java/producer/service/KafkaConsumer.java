package producer.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "my-first-topic", groupId = "my-group")
    public void consumer(String message) {
        log.info(String.format("Message read from the topic is :: %s", message));
    }
}
