package servidor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees() {
		List<Employee> list = service.getAllEmployees();
		return list;
	}

}
