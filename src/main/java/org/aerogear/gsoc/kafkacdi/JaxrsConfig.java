package org.aerogear.gsoc.kafkacdi;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.aerogear.gsoc.kafkacdi.resource.MessageResource;

@ApplicationPath("")
public class JaxrsConfig extends Application {

	public JaxrsConfig() {}
	
	@Override
	public Set<Object> getSingletons() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(new MessageResource());
        return set;
	}

}
