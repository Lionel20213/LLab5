
import Commands.*;
import Smth.*;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;


public class Main {


    public static void main(String[] args) throws IOException {
        boolean success=false;
        while (!success){
            try{
                FileM fileM = new FileM(args[0]);
                Vector<Vehicle> vehicles = fileM.readCSV();
                CollectionManager collectionManager = new CollectionManager(vehicles, fileM);
                System.out.println("Добро пожаловать!");
                System.out.println("Введите help для того чтобы начать");
                InputChecker inputChecker = new InputChecker();
                VehicleAsk vehicleAsk = new VehicleAsk();

                CommanManager commanManager = new CommanManager(new help(),
                        new info(collectionManager), new show(collectionManager), new add(collectionManager, vehicleAsk), new update(
                        collectionManager, inputChecker, vehicleAsk), new remove_by_id(collectionManager, inputChecker)
                        , new clear(collectionManager), new save(collectionManager), new execute(collectionManager), new exit(), new remove_last(collectionManager),
                        new Shuffle(collectionManager),
                        new group_counting_by_creation_date(collectionManager), new count_by_engine_power(collectionManager, inputChecker), new count_less_than_fuel_type());
                Commander commander = new Commander(commanManager, new Scanner(System.in), fileM);
                commander.interactiveMode();
                success=true;
            } catch (Exception e){

            }
        }
    }
}