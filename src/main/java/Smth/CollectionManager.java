package Smth;

import java.time.LocalDateTime;
import java.util.*;

public class CollectionManager {
    private final LocalDateTime creationDate = LocalDateTime.now();
    private Vector<Vehicle> vehicles;
    private final FileM fileM;

    public CollectionManager(Vector<Vehicle> vehicles, FileM fileM) {
        this.fileM=fileM;
        this.vehicles = vehicles;
    }

    public void add(Vehicle v) {
        vehicles.add(v);
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void show() {
        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString());
        }
    }

    public void clear() {
        vehicles.clear();
    }

    public void exit() {
        System.exit(2);
    }

    public boolean remove_by_id(Long id) {
        boolean flag = false;
        for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
            Vehicle vehicle = iterator.next();
            if (vehicle.getId() == id) {
                flag = true;
                iterator.remove();
            }
        }
        return !flag;
    }

    public void save() {
        fileM.writeCSV(vehicles);
    }

    public void Shuffle() {
        Collections.shuffle(vehicles);

    }


    public int size() {
        return vehicles.size();

    }

    public boolean count_by_engine_power(int enginePower) {
        int counter = 0;
        boolean flag = false;
        for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
            Vehicle vehicle = iterator.next();
            if (vehicle.getEnginePower() == enginePower) {
                flag = true;
                counter++;

            }

        }
        System.out.println(counter);
        return !flag;
    }

    public void group_counting_by_creation_date() {
//        HashMap<LocalDate, ArrayList<Vehicle>> hashMap = new HashMap<>();
//        int count=0;
//        int count1 = 0;
//        for (Vehicle el : vehicles) {
//            if (!hashMap.containsKey(el.getCreationDate())) {
//                ArrayList<Vehicle> arrayList = new ArrayList<>();
//                arrayList.add(el);
//                hashMap.put(el.getCreationDate(), arrayList);
//                count++;
//
//
//            } else {
//                ArrayList<Vehicle> arrayList = hashMap.get(el.getCreationDate());
//                arrayList.add(el);
//                hashMap.replace(el.getCreationDate(), arrayList);
//                count1++;
//            }
//        }

        Iterator<Vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString());
        }
    }


    public void remove_last() {
        for (Iterator<Vehicle> iterator = vehicles.iterator(); iterator.hasNext(); ) {
            Vehicle vehicle = iterator.next();
            if (vehicle == vehicles.lastElement()) {
                iterator.remove();
            }

        }


    }


}
