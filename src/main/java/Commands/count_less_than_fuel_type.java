package Commands;

import Smth.AbstrCommand;
import Smth.Commander;

public class count_less_than_fuel_type extends AbstrCommand {
    @Override
    public boolean execute(String argument) {
        System.out.println("noway");

        return true;
    }
}
