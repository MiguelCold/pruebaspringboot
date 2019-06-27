package cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeServiceConsumer {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/consumer")
	public String getAllEmployees() {
		return restTemplate.exchange("http://localhost:9080/employees", HttpMethod.GET, null, String.class).getBody();
	}
}