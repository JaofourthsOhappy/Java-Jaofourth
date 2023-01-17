import java.util.Scanner;
class BMI{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your Weight: ");
        int Weight = sc.nextInt();
        System.out.print("Enter your Height(x.xx): ");
        float Height = sc.nextFloat();
        

        System.out.println("Your BMI is:" + (Weight/(Height*Height)));


    }
}