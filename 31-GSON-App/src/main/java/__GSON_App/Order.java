package __GSON_App;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    Integer orderId;
    String orderBy;
    String orderStatus;
    Integer billAmount;


}
