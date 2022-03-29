package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;

public class info extends AbstrCommand {
    private final CollectionManager collectionManager;

    public info(CollectionManager c) {
        this.collectionManager = c;
    }


    @Override
    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        System.out.println("Коллекция типа : Vector");
        System.out.println("Дата создания: " + collectionManager.getCreationDate());
        System.out.println("Количество элементов: " + collectionManager.size());
        return true;
    }
}
