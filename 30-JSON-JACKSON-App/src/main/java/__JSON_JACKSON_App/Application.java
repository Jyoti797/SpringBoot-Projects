package __JSON_JACKSON_App;

import __JSON_JACKSON_App.bindings.Author;
import __JSON_JACKSON_App.bindings.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        //conversion of JAVA Obj ==> JSON

		Author author = new Author("H.C Verma","hcverma123@gmail.com","7978780756");
		Book book = new Book(101,"Concepts of Physics", 697, author);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Convertion Successfull.......");

        //conversion of JSON ==> JAVA Obj

//        File jsonFile = new File("book.json");
//        ObjectMapper mapper = new ObjectMapper();
//        Book b1 = mapper.readValue(jsonFile, Book.class);
//        System.out.println(b1);


    }

}
