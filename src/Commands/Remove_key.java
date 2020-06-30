package Commands;

import Controller.Commandable;
import Ticket.Ticket;
import Ticket.TicketCollection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Remove_key implements Commandable {
    @Override
    public Object execute(Object object) {
        return null;
    }

    @Override
    public String getName() {
        return "remove_key";
    }
}

