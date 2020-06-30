package Commands;

import Controller.Commandable;

import java.io.IOException;

public class Remove_lower_key implements Commandable {
    @Override
    public Object execute(Object o) throws IOException {
        return null;
    }


    @Override
    public String getName() {
        return "remove_lower_key";
    }

}
