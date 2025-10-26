package com.Kafka.producer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

import java.util.Random;
import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
        Random random = new Random();
        return () -> {
            String riderId = "rider" + random.nextInt(20);
            // Generate random latitude (-90 to 90) and longitude (-180 to 180)
            double latitude = -90 + (90 - (-90)) * random.nextDouble();
            double longitude = -180 + (180 - (-180)) * random.nextDouble();

            RiderLocation location = new RiderLocation(riderId, latitude, longitude);
            System.out.println("Sending Rider Location: " + riderId + " → (" + latitude + ", " + longitude + ")");
            return location;
        };
    }

    @Bean
    public Supplier<Message<String>> sendRiderStatus() {
        Random random = new Random();
        return () -> {
            String riderId = "rider" + random.nextInt(20);
            String status = random.nextBoolean() ? "rideStarted" : "rideCompleted";
            System.out.println(" Sending Rider Status: " + riderId + " → " + status);

            return MessageBuilder
                    .withPayload(riderId + " : " + status)
                    .setHeader(KafkaHeaders.KEY, riderId.getBytes())
                    .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.TEXT_PLAIN_VALUE)
                    .build();
        };
    }
}
