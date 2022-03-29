package Commands;

import Smth.AbstrCommand;
import Smth.CollectionManager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class execute extends AbstrCommand {
    private CollectionManager cm;

    public execute(CollectionManager cm) {
        this.cm = cm;
    }

    public boolean execute(String arg) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arg))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if ((line.split(" ")[0].equals("srcexecute_script"))) {
                    System.out.println(line);
                } else {
                    System.out.println("Неверная команда");
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не найден,пожалуйста введите существующий файл");
        }
        return true;
    }
}
