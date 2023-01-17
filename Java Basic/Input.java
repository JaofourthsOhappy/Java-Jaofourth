import java.util.Scanner;
class Input{
    public static void main(String[] args) {
         //ประกาศใช้ Class | new
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();  //รับค่า str จากแป้นพิมพ์ => name
        System.out.print("Enter your year: ");
        int year = sc.nextInt();
        int age = 2023 - year;
        System.out.println("Hello " +  name);
        System.out.println("Years is " + year);
        System.out.println("Age is " + age);

    }
}