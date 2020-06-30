package Commands;

import Controller.CommandWithoutArg;
import Controller.Commandable;
import Ticket.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Print_field_descending_type implements CommandWithoutArg {
    @Override
    public Object execute(Object object) {
        return null;
    }
    @Override
    public String getName() {
        return "print_field_descending_type";
    }
}
