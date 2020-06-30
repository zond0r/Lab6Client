package Commands;

import Controller.CommandWithoutArg;
import Ticket.Ticket;
import Ticket.TicketCollection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Print_ascending implements CommandWithoutArg {
    @Override
    public Object execute(Object object) {
        return null;
    }

    @Override
    public String getName() {
        return "print_ascending";
    }
}
