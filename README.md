# Kafka Rider Tracking System

This project demonstrates a **Kafka-based Rider Tracking System** using **Spring Boot**, **Spring Cloud Stream**, and **Docker**. It simulates riders sending their location and ride status to Kafka topics, and a consumer application that processes these messages.  

---

## Project Overview

- **Producer**:
  - Sends rider locations (`RiderLocation`) to `my-topic` (JSON format)
  - Sends rider status (rideStarted/rideCompleted) to `new-topic` (plain text)
  - Uses Spring Cloud Stream `Supplier` functions
  - Generates random rider data

- **Consumer**:
  - Listens to `my-topic` and `new-topic`
  - Processes messages using `Function` functions in Spring Cloud Stream
  - Can handle JSON (`RiderLocation`) and plain text

- **Kafka & Zookeeper**:
  - Runs in Docker containers
  - Topics can be managed via Kafka CLI or Docker exec

- **Goals**:
  - Learn Kafka integration with Spring Cloud Stream
  - Produce/consume messages
  - Work with partitions and topics
  - Simulate real-time rider tracking

---

## Prerequisites

- Docker & Docker Compose
- Java 17+
- Maven or Gradle
- Spring Boot (2.7+ recommended)
- Optional: Kafka CLI tools

---
