package JavaOOP;

public class Main {
    public static void main(String[] args) {
        // e1.id = "1";
        // e1.name = "Fourth";
        // e1.salary = 200000.0;

        // System.out.println("ID =" + e1.id);
        // System.out.println("Name =" + e1.name);
        // System.out.println("Salary =" + e1.salary);
        // Employee e1 = new Employee();
        // e1.setId("1");
        // e1.setName("Fourth");
        // e1.setSalary(30000.0);
        // // e1.displayEmployee();
        // System.out.println(e1.getname());
        // System.out.println(e1.getsalary());

        // Employee e2 = new Employee(); 
        // e2.setId("2");
        // e2.setName("Amm");
        // e2.setSalary(50.0);
        // // e2.displayEmployee(); 
        // System.out.println(e2.getname());
        // System.out.println(e2.getsalary());

        Employee e1 = new Employee();
        e1.displayEmployee();

        int result = Employee.minsalary;
        System.out.println(result);


    }
    
}
