package Ticket;

public class UI {
    Controller controller;


    public UI (Controller controller)
    {
        this.controller = controller;
    }

    public void ButtonPressed()
    {
        System.out.println("Pressed the Button:     ");
        controller.CreateTicket();
    }

}