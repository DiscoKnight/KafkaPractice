package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Map;

public class SimpleProducer extends KafkaProducer<String, String>  implements Producer {

    public SimpleProducer(Map<String, Object> configs) {
        super(configs);
    }
}
