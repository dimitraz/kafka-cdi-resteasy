package org.aerogear.gsoc.kafkacdi.rest;

import net.wessendorf.kafka.cdi.annotation.Consumer;
import java.util.logging.Logger;

public class MessageListener {

    Logger logger = Logger.getLogger(MessageListener.class.getName());

    @Consumer(topic = "kafka-published", groupId = "consumerGroup1")
    public void consume(final String payload) {
        logger.warning(payload);
    }

}
