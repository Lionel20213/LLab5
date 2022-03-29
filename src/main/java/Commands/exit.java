package Commands;

import Smth.AbstrCommand;
import Smth.Commander;

public class exit extends AbstrCommand {
    @Override
    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        System.exit(0);
        return true;
    }
}
