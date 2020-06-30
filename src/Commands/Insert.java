package Commands;

import Controller.CommandWithObject;
import Ticket.Ticket;
import Ticket.TicketCollection;
import Utility.ScriptException;

import java.util.InputMismatchException;

public class Insert implements CommandWithObject {
    TicketCollection ticketCollection = new TicketCollection();
    long id;

    @Override
    public boolean check(Object arg) {
        return false;
    }

    @Override
    public Ticket getNewTicket() {
        return null;
    }


    @Override
    public Object execute(Object object) {
        return null;
    }

    @Override
    public String getName() {
        return "insert";
    }

}
