package Commands;

import Controller.CommandWithObject;
import Ticket.Ticket;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Update implements CommandWithObject {

    @Override
    public Object execute(Object o) throws FileNotFoundException, IOException {
        return null;
    }

    @Override
    public String getName(){
        return "update";
    }


    @Override
    public boolean check(Object arg) {
        return false;
    }

    @Override
    public Ticket getNewTicket() {
        return null;
    }
}
