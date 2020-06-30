package Commands;

import Controller.Commandable;
import Ticket.Ticket;
import Ticket.TicketCollection;

import java.io.IOException;
import java.util.Map;

public class Filter_starts_with_name implements Commandable {

    @Override
    public Object execute(Object object) {
        return null;
    }


    @Override
    public String getName() {
        return "filter_starts_with_name";
    }
}
