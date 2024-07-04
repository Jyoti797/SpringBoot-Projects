package __XML_JAX_B_App.bindings;


import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
public class Person {
    Integer id;
    String name;
    Integer age;
    //transient variables will not participate in xml component creation
    @XmlTransient
    String phoneNum;
    Address address;

    @XmlAttribute
    String type;

}
