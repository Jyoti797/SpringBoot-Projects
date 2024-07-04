package __XML_JAX_B_App;

import __XML_JAX_B_App.bindings.Address;
import __XML_JAX_B_App.bindings.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);


        //convert JAVA to xml

//		try {
//			Address addr = new Address("cuttack", "Odisha", "India");
//
//			Person person = new Person(05,"Jyoti Ranjan Mohanta",25,"7537091014",addr,"Doctor");
//
//			//marshelling
//			JAXBContext instance = JAXBContext.newInstance(Person.class);
//			Marshaller marshaller =  instance.createMarshaller();
//			marshaller.marshal(person, new File("Person.xml"));
//
//			System.out.println("Marshelling completed");
//		} catch (JAXBException e) {
//			System.out.println(e.getMessage());
//		}

        //Convert xml to JAVA
        File xmlFile = new File("Person.xml");
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object object = unmarshaller.unmarshal(xmlFile);
        Person p1 = (Person) object;
        System.out.println(p1);


    }

}
