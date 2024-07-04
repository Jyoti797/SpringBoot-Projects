package nareshIT.__Lombak_Test_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Employee e1 = new Employee(01,"Abhijit Mohanty", 32000);

//		System.out.println("Employee 1 id = " + e1.getEmpId());
//		System.out.println("Employee 1 name = " + e1.getEmpName());
//		System.out.println("Employee 1 salary = " + e1.getEmpSal());

		System.out.println(e1);

		Student s1 = new Student(05, "Jyoti Ranjan Mohanta");
		Student s2 = new Student(04, "Jashobanta Mohanty");

		System.out.println(s1);
		System.out.println(s2);










	}

}
