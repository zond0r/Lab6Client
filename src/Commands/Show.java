package Commands;

import Controller.CommandWithoutArg;
import Ticket.Ticket;
import Ticket.TicketCollection;

import java.util.HashMap;
import java.util.Map;

public class Show implements CommandWithoutArg {
    private TicketCollection ticketCollection = new TicketCollection();

    @Override
    public Object execute(Object object) {
        return null;
    }

    @Override
    public String getName() {
        return "show";
    }

}
