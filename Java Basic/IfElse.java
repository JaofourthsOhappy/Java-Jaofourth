import java.util.Scanner;

class IfElse{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int age = sc.nextInt();

        if(age<10){
            System.out.println("Baby");
        }else if(age<25){
            System.out.println("Young");
        }else if(age<60){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }
    }
}