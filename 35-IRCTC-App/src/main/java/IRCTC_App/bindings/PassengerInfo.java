package IRCTC_App.bindings;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerInfo {
    String name;
    String phoneNum;
    String journeyDate;
    String from;
    String to;
    String trainNumber;
}
