package __JSON_JACKSON_App.bindings;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @JsonProperty(value="bookId")
    Integer id;
    String name;
    Integer price;

    Author author;

}
