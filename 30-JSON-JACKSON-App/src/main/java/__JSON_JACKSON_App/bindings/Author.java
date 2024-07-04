package __JSON_JACKSON_App.bindings;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    String authorname;
    String authorEmail;
    String authorPhoneNumber;

}
