package org.aerogear.gsoc.kafkacdi.rest;

import net.wessendorf.kafka.SimpleKafkaProducer;
import net.wessendorf.kafka.cdi.annotation.Producer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/publish")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    private final String KAFKA_TOPIC = "kafka-published";

	@Producer(topic = KAFKA_TOPIC)
	SimpleKafkaProducer<String, String> producer;

	@GET
	@Path("/{param}")
	public Response publishMessage(@PathParam("param") String message) {

		if (producer == null) {
			return Response.status(200).entity("Producer is null").build();
		}
		else {
			producer.send(message);
			return Response.status(200).entity(message).build();
		}

	}

}