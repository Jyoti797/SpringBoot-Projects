package ashokIT.__DataJPA_JpaRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		//jpaRepository has ability of sorting, pagination, query by

		//sorting data by age in descending order
//		List<User> result = repository.findAll(Sort.by("userAge").descending());
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//sorting data by name in descending order
//		List<User> result = repository.findAll(Sort.by("userName").descending());
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//sorting based on multiple columns
//		List<User> result = repository.findAll(Sort.by("userName","userAge").descending());
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//Pagination
//        Integer pageNumber = 0;
//		Integer pageSize = 5;
//		PageRequest pagerequest = PageRequest.of(pageNumber, pageSize);
//		 Page<User> pageData = repository.findAll(pagerequest);
//
//		 int totalPages = pageData.getTotalPages();
//		System.out.println("Total Pages: " + totalPages);
//
//		 List<User> result = pageData.getContent();
//		 result.forEach(user ->{
//			 System.out.println(user);
//		 });

		//Query By Example: It is used to prepare SQL query dynamically

		// findBy() method :: setting values are mandatory
		// entity.set()  :: setting values are optional

//		User entity = new User();
//		entity.setUserHome("USA");
//
//        Example <User>	example =Example.of(entity);
//		List<User> result = repository.findAll(example);
//		result.forEach(user->{
//			System.out.println(user);
//		});

		//combination of example and pagination
		//findAll() follows methodOverloading..

//		repository.findAll(example, sort);
//		repository.findAll(example, pageable);
	}



}
