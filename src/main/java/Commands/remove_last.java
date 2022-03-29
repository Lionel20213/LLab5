package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;


public class remove_last extends AbstrCommand {
    private CollectionManager cm;

    public remove_last(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public boolean execute() {
        cm.remove_last();
        return true;
    }

    public boolean execute(String argument) {
        return false;
    }
}

