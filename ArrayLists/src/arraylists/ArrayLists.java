package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("John", "Doe", 101));
        empList.add(new Employee("Richie", "Spice", 202));
        empList.add(new Employee("Neil", "Power", 1233));
        
        //empList.forEach(employee -> System.out.println(employee));
        
        System.out.println(empList.get(2));
        System.out.println(empList.isEmpty());
        
        empList.set(2, new Employee("Mike", "Tenza", 99));
        //empList.forEach(employee -> System.out.println(employee));
        
        Employee[] empArray = empList.toArray(new Employee[empList.size()]);
        for(Employee emp : empArray)
            System.out.println(emp);
        
        empList.remove(2);
    }    
}
