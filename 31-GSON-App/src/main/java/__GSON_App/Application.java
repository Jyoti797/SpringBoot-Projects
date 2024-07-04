package __GSON_App;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileReader;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);

		Order order = new Order(101, "Ramu", "confirmed", 1749);
		Gson gson = new Gson();
		String json = gson.toJson(order);
		System.out.println(json);

//		gson.fromJson(new FileReader(new File("order.json")), Order.class);
	}

}
