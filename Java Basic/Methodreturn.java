import java.util.Scanner;
class Methodreturn {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = ds.nextDouble();
        System.out.println("Your salary is: " + salary);
        double bonus = getbonus();
        salary+=bonus;
        System.out.println("Your salary with bonus is: " + salary);
    }

    static Double getbonus(){
        return 1000.0 ;
    }
}

