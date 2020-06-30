package Commands;

import Controller.CommandWithoutArg;
import Ticket.TicketCollection;

public class Clear implements CommandWithoutArg {
    TicketCollection ticketCollection = new TicketCollection();
    @Override
    public Object execute(Object object) {
        return null;
    }

    @Override
    public String getName() {
        return "clear";
    }


}
