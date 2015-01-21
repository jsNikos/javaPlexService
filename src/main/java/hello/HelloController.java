package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired(required=true)
	private PersistenceHomology persistenceHomology;
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/persistenceHomology")
    public String persistenceHomology() {
        return persistenceHomology.compute();
    }

}