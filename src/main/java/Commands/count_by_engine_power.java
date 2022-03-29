package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.Commander;
import Smth.InputChecker;

public class count_by_engine_power extends AbstrCommand {
    private CollectionManager cm;
    private InputChecker ic;

    public count_by_engine_power(CollectionManager cm, InputChecker ic) {
        this.cm = cm;
        this.ic = ic;
    }

    @Override
    public boolean execute(String argument) {
        if (ic.integerValidCheck(argument, (int) 0, Integer.MAX_VALUE)) {
            int enginePower = Integer.parseInt(argument);
            if (cm.count_by_engine_power((Integer) enginePower)) {
                System.out.println("Такой мощности не существует.Пожалуйста введите существующую мощность двигателя!");
                return false;
            }
            return true;
        }
        //System.out.println("Введенный id имеет неправильный формат!Введеный id должен содеражать значение больше 0!");
        return false;
    }

}

