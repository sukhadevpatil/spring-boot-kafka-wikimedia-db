### Test
1. Create Spring Boot project
2. Create module - like - kafka
3. Refer - https://kafka.apache.org/quickstart & follow following steps
   a. start zookeeper :: >.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
   b. start kafka server :: >.\bin\windows\kafka-server-start.bat .\config\server.properties
   c. create topic to store events :: >.\bin\windows\kafka-topics.bat --create --topic wikimedia-topic --bootstrap-server localhost:9092
   d. write some events to topic :: >.\bin\windows\kafka-topics.bat --create --topic wikimedia-topic --bootstrap-server localhost:9092
   e. read the events :: >.\bin\windows\kafka-console-consumer.bat --topic wikimedia-topic --from-beginning --bootstrap-server localhost:9092
4. After testing the topic can proceed on remaining stuff
5. Add dependencies - spring-kafka, okhttp-eventsource, jackson-core, jackson-databind
6. The wikimedia recentchange url :: https://stream.wikimedia.org/v2/stream/recentchange
7. Add module - kafka-consumer
8. Create KafkaDatabaseConsumer
9. Configure Database - h2 or as your choice
10. Update application.properties for JPA & DB connections
11. Create entity & repository
12. Use entity & repository to store the event data
13. Start Producer & Consumer 
14. Check db table for the data get persisted
