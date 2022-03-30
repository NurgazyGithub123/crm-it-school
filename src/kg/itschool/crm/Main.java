package kg.itschool.crm;

import kg.itschool.crm.dao.CourseFormatDao;
import kg.itschool.crm.dao.ManagerDao;
import kg.itschool.crm.dao.daoutil.DaoFactory;
import kg.itschool.crm.model.CourseFormat;
import kg.itschool.crm.model.Manager;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // CourseFormat courseFormat = new CourseFormat();

       Scanner scan = new Scanner(System.in);
/*
        System.out.print("Course format: ");
        courseFormat.setFormat(scan.nextLine());

        System.out.print("Сourse duration weeks: ");
        courseFormat.setCourseDurationWeeks(scan.nextInt());
        scan.nextLine();

        System.out.print("lesson duration: ");
        courseFormat.setLessonDuration(LocalTime.ofSecondOfDay(scan.nextInt()));

        System.out.print("lesson per week: ");
        courseFormat.setLessonPerWeek(scan.nextInt());
        scan.nextLine();

        System.out.print("Is online: ");
        courseFormat.setOnline(scan.nextBoolean());

        System.out.println("Input: " + courseFormat);
*/
        CourseFormatDao courseFormatDao = DaoFactory.getCourseFormatDaoSQL();

        //courseFormatDao.save(courseFormat);

        Manager manager = new Manager();

        System.out.println("F");
        manager.setFirstName(scan.nextLine());

        System.out.println("L");
        manager.setLastName(scan.nextLine());

        System.out.println("E");
        manager.setEmail(scan.nextLine());

        System.out.println("Phon");
        manager.setPhoneNumber(scan.nextLine());

        System.out.println("S");
        manager.setSalary(scan.nextDouble());
        scan.nextLine();

        System.out.println("D");
        manager.setDob(LocalDate.parse(scan.nextLine()));


        ManagerDao managerDao = DaoFactory.getManagerDaoSQL();
        managerDao.save(manager);
        //System.out.println(managerDao.findById(2l));



        //System.out.println(courseFormatDao.findById(1l));

    }
}
