# Testing the Kafka CDI
RESTeasy Swarm application to test the Kafka CDI extension by [@matzew](https://github.com/matzew).


## Building

Build the Wildfly Swarm fat jar, and run:

```
$ mvn clean install
$ java -jar target/kafkacdi-<version>-swarm.jar
```

Publish a message:

```
/publish/{message}
```