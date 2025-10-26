package com.Kafka.producer;

//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//
//    private final KafkaTemplate<String ,RiderLocation> kafkaTemplate;
//
//    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping("/send")
//    public String sendMessage(@RequestParam String message){
//        RiderLocation location = new RiderLocation("rider1",28.61,77.23);
//        kafkaTemplate.send("new-topic", location);
//        return "Message sent:"+location.getRiderId();
//    }
//}

