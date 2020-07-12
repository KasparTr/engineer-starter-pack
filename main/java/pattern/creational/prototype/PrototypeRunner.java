package pattern.creational.prototype;

import java.util.List;

/**
 * Source: https://www.journaldev.com/1440/prototype-design-pattern-in-java
 */
public class PrototypeRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmployees();
        list.add("John");
        List<String> list1 = empsNew1.getEmployees();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmployees());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
