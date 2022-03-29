package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.Commander;

public class show extends AbstrCommand {
    private final CollectionManager cm;

    public show(CollectionManager c) {
        this.cm = c;
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        cm.show();
        return true;
    }
}
