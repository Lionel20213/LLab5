package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;


public class Shuffle extends AbstrCommand {
    private CollectionManager collectionManager;

    public Shuffle(CollectionManager c) {
        this.collectionManager = c;

    }

    @Override
    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        collectionManager.Shuffle();
        return true;
    }
}
