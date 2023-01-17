import java.util.Scanner;
class Changeyear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BD year: ");
        int bd = sc.nextInt();
        int cs = bd - 543;
        System.out.println("CS year is " + cs);

    }
}