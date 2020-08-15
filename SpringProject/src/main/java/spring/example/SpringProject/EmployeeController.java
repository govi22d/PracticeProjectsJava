package spring.example.SpringProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/getemployees")
	public String getemployees() {
		EmployeeRepository repo = new EmployeeRepository();
		List<Employee> ems1 = repo.getAllEmplyee();
		StringBuilder sb = new StringBuilder();
		sb.append("id" + ", " + "name" + ", " + "age");
        for(Employee e: ems1) {
        	sb.append(" "+e.toString());
        }
		return sb.toString();
	}
	
	@RequestMapping("/getemployee")
	public String getemployee() {
		EmployeeRepository repo = new EmployeeRepository();
		Employee emp = repo.getEmplyee(1);
		return emp.toString();
	}
	
//	@Value("${spring.application.name}")
//	private String name;
//	@RequestMapping("/")
//	public String getMyAppName() {
//		return name;
//	}
}
