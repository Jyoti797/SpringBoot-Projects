package ashokIT.__DataJPA_Timestamping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

	ProductRepository repository = 	context.getBean(ProductRepository.class);

		Product p2 = new Product( "Godrej Room Freshner", 149);
		Product p3 = new Product("Haldiram Aloobhujiaaa", 210);
		Product p4 = new Product( "Tata Black Chana", 169);
		Product p5 = new Product( "Kissan Tomato & Chilli Sauce", 190);
		Product p6 = new Product ("Amul Ice Cream 750gm", 150);
		Product p7 = new Product( "Kanha Alu Dum Dahibara", 60);
		Product p8 = new Product( "Sai Biriyani ", 149);
		Product p9 = new Product( "Ajanta Watch", 699);
		Product p10 = new Product( "Lactocalamine Moisturizer", 120);
		Product p11 = new Product("Milton water Bottle", 599);
		Product p12 = new Product( "HP 128GB pendrive", 939);
		Product p13 = new Product( "Livon Hair serum", 210);
		Product p14 = new Product ("Campus Northen plus shoe", 1699);
		Product p15 = new Product( "TVS Raider 125cc", 109999);
		Product p16 = new Product( "SB Front Chaat", 40);
		Product p17 = new Product( "Paanipuri", 40);

	repository.saveAll(Arrays.asList( p2, p3, p4, p5, p6, p7, p8, p9,p10, p11, p12, p13, p14, p15, p16, p17));

//		Product p1 = new Product();
//		p1.setProductName("Tata Himalayan Pink Salt");
//		p1.setProductPrice(150);
//
//		repository.save(p1);


	}

}
