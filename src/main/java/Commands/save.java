package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.Commander;

public class save extends AbstrCommand {
    private final CollectionManager cm;

    public save(CollectionManager cm) {
        this.cm = cm;

    }

    @Override
    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        cm.save();
        return true;
    }
}
