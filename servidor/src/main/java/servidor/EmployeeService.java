package servidor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Mahesh", "Medellín"));
		list.add(new Employee(2, "Ram", "Cali"));
		list.add(new Employee(3, "Krishna", "Bogota"));
		return list;
	}

}