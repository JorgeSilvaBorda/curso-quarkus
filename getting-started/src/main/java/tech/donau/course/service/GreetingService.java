package tech.donau.course.service;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

@ApplicationScoped
public class GreetingService {
    
    //Por defecto los Logger parten en nivel "INFO"
    private static Logger LOGGER = Logger.getLogger(GreetingService.class.getName());
    
    @ConfigProperty(name = "greeting.saludo")
    String saludo;
    
    @ConfigProperty(name = "greeting.suffix", defaultValue = ";")
    String suffix;
    
    public String sayHello(){
        //LOGGER.info("Say Hello to random user");
        LOGGER.info("Say Hello to random user");
        return saludo + suffix;
    }
    
}
