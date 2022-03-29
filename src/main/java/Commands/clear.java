package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.Commander;

public class clear extends AbstrCommand {
    private CollectionManager collectionManager;

    public clear(CollectionManager C) {
        this.collectionManager = C;
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }

    @Override
    public boolean execute() {
        collectionManager.clear();
        return true;
    }
}
