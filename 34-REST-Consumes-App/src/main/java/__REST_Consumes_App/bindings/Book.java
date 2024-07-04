package __REST_Consumes_App.bindings;


import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Book {
    Integer bookId;
    String bookName;
    Integer bookPrice;
}
