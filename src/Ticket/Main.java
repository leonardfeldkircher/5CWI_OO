package Ticket;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Controller controller = new Controller(printer);

        UI ui = new UI(controller);
        
        ui.ButtonPressed();
        System.out.println(controller.getTickets().getLast());
    }
}