package com.pandurang;

import java.util.*;

public class SortEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Pandurang Mane", "IT", 20000);
        Employee e6 = new Employee(6, "Pandurang Mane", "IT", 25000);
        Employee e2 = new Employee(2, "Shaashwat Narayan", "Consulting", 25000);
        Employee e3 = new Employee(3, "Gurwinder Kaur", "Data & Analytics", 30000);
        Employee e4 = new Employee(4, "Yash Koli", "IT", 40000);
        Employee e5 = new Employee(5, "Meenaxi Singh", "Consulting", 50000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

//        List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).toList();
//        sortedEmployees.forEach(System.out::println);

        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
    }

}
