package ashokIT.__DataJPA_findByMethods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);



		ashokIT.__Data_JPA.UserRepository repository = context.getBean(ashokIT.__Data_JPA.UserRepository.class);

//	Optional<User> findById = repository.findById( Long.valueOf(5));
//		if (findById.isPresent()){
//			System.out.println(findById.get());
//		}

//	Iterable<User> allById =	repository.findAllById(Arrays.asList(Long.valueOf(5),Long.valueOf(13), Long.valueOf(21)));
//   allById.forEach((user -> {
//	   System.out.println(user);
//   }));

//		Iterable<User> findAll = repository.findAll();
//		findAll.forEach(user -> {
//			System.out.println(user);
//		});

//		long count = repository.count();
//		System.out.println("Total Records available in table is " + count);

//		Long user = Long.valueOf(14);
//	boolean isAvailable =	repository.existsById(user);
//	if(isAvailable){
//		System.out.println("UserId " + user + " is present in the database");
//	}else{
//		System.out.println("UserId " + user + " is not available in the database ");
//	}

//		Long removeUser = Long.valueOf(21);
//		repository.deleteById(removeUser);

		//based on our method name JPA will prepare the query and it will execute them
		// findBy+variableName(parameters)

		//retrive records who are belog to Jajpur
//		List<User> findbydistrict =  repository.findByDistrict("Jajpur");
//
//		findbydistrict.forEach(user -> {
//			System.out.println(user);
//		});

		//retrive users whose age is  equal to 25years
//		List<User> findbyage = repository.findByAge(25);
//		findbyage.forEach(user -> {
//			System.out.println(user);
//		});

		//retrive users whose age is  greater than  25years
//		List<User> result = repository.findByAgeGreaterThan(25);
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//retrive users whose age is  less than equal to 23 and gender is Female
//		List<User> result = repository.findByAgeLessThanEqualAndGender(23, "Female");
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//retrive users whose district is Hyderbad and Kendrapada
//		List<User> result = repository.findByDistrictIn(Arrays.asList("Hyderbad","Kendrapada", "Berhumpur"));
//		result.forEach(user ->{
//			System.out.println(user);
//		});

		//retrive user whose district is cuttack and age is 25

//		List <User> result = repository.findByAgeAndDistrict(25,"Cuttack");
//		result.forEach(user -> {
//			System.out.println(user);
//		});

		//retrive a user whose district is cuttack and age is 23 and gander is female
//		List<User> result = repository.findByDistrictAndAgeAndGender("Cuttack", 23, "Female");
//		result.forEach(user ->{
//			System.out.println(user);
//		});
		
	}

}
