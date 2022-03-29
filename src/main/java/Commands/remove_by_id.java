package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;
import Smth.InputChecker;

public class remove_by_id extends AbstrCommand {
    private CollectionManager cm;
    private InputChecker ic;

    public remove_by_id(CollectionManager cm, InputChecker ic) {
        this.cm = cm;
        this.ic = ic;
    }

    @Override
    public boolean execute(String argument) {
        if (ic.longValidCheck(argument, (long) 0, Long.MAX_VALUE)) {
            int id = Integer.parseInt(argument);
            if (cm.remove_by_id((long) id)) {
                System.out.println("Такого id не существует.Пожалуйста введите существующий id!");
                return false;
            }
            return true;
        }
        System.out.println("Введенный id имеет неправильный формат!Введеный id должен содеражать значение больше 0!");
        return false;
    }

}
