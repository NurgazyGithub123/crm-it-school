package kg.itschool.crm;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //ManagerDao managerDao = (ManagerDao) DaoContext.autowired("ManagerDao", "singleton");


        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i <100_000 ; i++) {
            list.add(rnd.nextInt(1000));
        }
        Long end = System.currentTimeMillis();

        System.out.println("Beginning: " + (end - start));
    }
}
