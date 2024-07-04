package IRCTC_App.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketInfo {
    Integer ticketId;
    String pnr;
    String ticketStatus;

}
