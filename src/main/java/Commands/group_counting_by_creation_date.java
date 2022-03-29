package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.Commander;

public class group_counting_by_creation_date extends AbstrCommand {
    private CollectionManager cm;

    public group_counting_by_creation_date(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public boolean execute(String argument) {
        return false;
    }

    @Override
    public boolean execute() {
        cm.group_counting_by_creation_date();
        return true;
    }
}
