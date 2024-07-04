package IRCTC_App.rest;


import IRCTC_App.bindings.PassengerInfo;
import IRCTC_App.bindings.TicketInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketRestController {
    //REST API having GET, POST, PUT, DELETE request
    @GetMapping("/ticket/{ticketId}")
    public ResponseEntity<TicketInfo> getTicket(@PathVariable("ticketId") Integer ticketId) {
        //logic to get ticket Data
        TicketInfo tinfo = new TicketInfo(102, "OD05Z5386", "Confirmed");
        return new ResponseEntity<>(tinfo, HttpStatus.OK);
    }

    @PostMapping(value = "/ticket", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<TicketInfo> bookTicket(PassengerInfo request) {
        System.out.println(request);
        //logic to book ticket
        TicketInfo ticket = new TicketInfo(101, "OD05Z5386", "Confirmed");
        return new ResponseEntity<TicketInfo>(ticket, HttpStatus.CREATED);
    }

    @PutMapping("/ticket")
    public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request) {

        System.out.println(request);
        //logic to update ticket
        String msg = "Ticket updated";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

    @DeleteMapping("/ticket/{ticketId}")
    public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId) {
        //logic to delete ticket
        String msg = "Ticket deleted";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}

//@RequestBody :; if u want to deal with huge amount of data then u will go with @RequestBody
//@PathVariable :; if u want to deal with any kind of ID then u will go with @PathVariable
