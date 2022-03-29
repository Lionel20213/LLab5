package Smth;

import Intefaces.Commands;

public abstract class AbstrCommand implements Commands {
    public boolean execute(boolean argument) {
        return false;
    }

    public boolean execute() {
        return false;
    }
}
