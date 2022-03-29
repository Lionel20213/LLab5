package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.Commander;

import Smth.VehicleAsk;

public class add extends AbstrCommand {
    private CollectionManager cm;
    private VehicleAsk ca;

    public add(CollectionManager cm, VehicleAsk ca) {
        this.cm = cm;
        this.ca = ca;
    }


    @Override
    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        cm.add(ca.createVehicle());
        return true;
    }
}
