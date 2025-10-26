//package com.Kafka.consumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaConsumer {
//    @KafkaListener(topics = "my-topic" , groupId = "my-new-group")
//    public void listen1(String message){
//        System.out.println("Received Message 1: "+message);
//    }
//    @KafkaListener(topics = "my-topic" , groupId = "my-new-group-1")
//    public void listen2(String message){
//        System.out.println("Received Message 2: "+message);
//    }
//
//    @KafkaListener(topics = "new-topic" , groupId = "new-rider-group")
//    public void listenRiderLocation(RiderLocation riderLocation){
//        System.out.println("Received location: "+ riderLocation.getRiderId()+" : "+riderLocation.getLatitude()+" : "+riderLocation.getLongitude());
//    }
//}
