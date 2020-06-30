package Commands;


import Controller.CommandWithoutArg;
import Ticket.TicketCollection;

public class Info implements CommandWithoutArg {

    @Override
    public Object execute(Object object) {
        return null;
    }


    @Override
    public String getName() {
        return "info";
    }
}
