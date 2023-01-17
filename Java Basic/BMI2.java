import java.net.SocketPermission;
import java.util.Scanner;
class BMI2 {
    public static void main(String[] args){
        Scanner eiei = new Scanner(System.in);
        System.out.print("Enter your Weight(KG): ");
        int kg = eiei.nextInt();
        System.out.print("Enter your Height(M,x.xx): ");
        float m = eiei.nextFloat();

        double bmi = kg/(m*m);
        System.out.println("Your BMI is:" +  bmi);

        if(bmi<18){
            System.out.print("lower");
        }else if (18.5 >= bmi && bmi <= 22.9){
            System.out.print("OK");
        }else if (23 >= bmi && bmi <= 29.9){
            System.out.print("Fat");
        }else{
            System.out.print("Diee");
        }

    }
}
