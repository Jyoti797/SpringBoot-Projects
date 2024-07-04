package ashokIT.__Data_JPA;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

     UserCustom custom =  context.getBean(UserCustom.class);

	 UserRepository repository = context.getBean(UserRepository.class);

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

		//retrive all data from user_master
//		List<User> result = custom.getAllUsers();
//		result.forEach(user->{
//			System.out.println(user);
//		});

//		User u5 = new User(60, "Narendra Modi", "Male", 72, "India");
//		User u6 = new User(61, "Andres Manuel Lopez Obrador", "Male", 65,"Mexico");
//		User u7 = new User(62, "Anthony Albanese", "Male", 67, "Australia");
//		User u8 = new User(63, "Alien Berset", "Female", 45, "Swizerland");
//		User u9 = new User(64, "Luca De Silva", "Female", 36, "Brazil");
//		User u10 = new User(65, "Rishi Sunak", "Male", 42, "UK");
//		User u11= new User(66, "Emmanuel Macron", "Male", 41, "France");
//		User u12 = new User(67, "Fumio Kishida", "Male", 82, "Japan");
//		User u13 = new User(68, "Xi Jingping", "Male", 78, "China");
//		User u14 = new User(69, "Vladimir Putin", "Male", 69, "Russia");
//		User u15 = new User(70, "Angela Morkel", "Female", 39, "Germany");
//		User u16 = new User(71, "Mohammad Bin Salman", "Male", 38, "Saudi Arabia");
//		User u17 = new User(72, "Benjamin Netanyahu", "Male", 53, "Israel");
//		User u18 = new User(73, "Ali Hoseini Khameinei", "Male", 44, "Iran");
//		User u19 = new User(74, "Kim Jong Un", "Male", 41, "North Korea");
//
//		repository.saveAll(Arrays.asList(u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16, u17, u18, u19));

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
