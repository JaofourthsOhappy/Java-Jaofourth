package JavaOOP;

class Employee {
    // public String id;
    // public String name;
    // public double salary;

    // attributes
    private String id;
    private String name;
    private double salary;

    //Default constructor
    public Employee() {
        System.out.println("I am Employee");
    }
    // static attributes
    static int minsalary = 120000;




    // methods
    public void setId(String ids) {
        this.id=ids;
    }
    public void setName(String names){
        this.name=names;
    }
    public void setSalary(Double salarys){
        this.salary=salarys;
    }
    public void  displayEmployee(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: "+ this.name);
        System.out.println("Salary: " + this.salary);
    }
    public String getname(){
        return this.name; 
    }
    public Double getsalary(){
        return this.salary;
    }

    public  void bonus(){ 
        System.out.println("Bonus = 10%");
    }
}
 