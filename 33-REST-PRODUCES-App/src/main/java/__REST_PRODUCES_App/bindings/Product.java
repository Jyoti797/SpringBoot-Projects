package __REST_PRODUCES_App.bindings;


import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@XmlRootElement
public class Product {

    Integer productId;
    String productName;
    Integer productPrice;

}

//you can use Product class to represent XML data as well as JSON data
// @XmlRootElement :: used to convert an JAVA object ==> Xml Element
