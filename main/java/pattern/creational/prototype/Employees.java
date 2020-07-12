package pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://www.journaldev.com/1440/prototype-design-pattern-in-java
 */
public class Employees implements Cloneable{

    private List<String> employees;

    public Employees(){
        employees = new ArrayList<String>();
    }

    public Employees(List<String> employees){
        this.employees=employees;
    }
    public void loadData(){
        //expensive operations. Eead all employees from database and put into the list
        employees.add("Pankaj");
        employees.add("Raj");
        employees.add("David");
        employees.add("Lisa");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> holder = new ArrayList<String>();
        for(String s : this.getEmployees()){
            holder.add(s);
        }
        return new Employees(holder);
    }

}