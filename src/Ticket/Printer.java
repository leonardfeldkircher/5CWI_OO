package Ticket;

public class Printer {
    
    public Ticket PrintTicket()
    {
        Ticket ticket = new Ticket();
        System.out.println("\n id: " + ticket.getId() + " \n created: " + ticket.getCreatedTimeStamp());
        return ticket;
    }
}