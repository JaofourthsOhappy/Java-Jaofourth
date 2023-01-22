import java.util.InputMismatchException;
import java.util.Scanner;
class ExceptionDemo {
    public static void main(String[] args) {
        try{
            // int a = 10;
            // int b = 0;
            // int c = a/b;
            // System.out.println(c);


            // int [] numbers = {10,203,40,50,60};
            // System.out.println(numbers[100]);

            Scanner kb = new Scanner(System.in);
            System.out.print("Enter number: ");
            int id = kb.nextInt();
            System.out.println(id);


        }catch(ArithmeticException e){
            System.out.println("Don't Divide by Zero");
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Don't found array index ");
        }
        catch(InputMismatchException e){
            System.out.println("Pls Entrer Number Only!!!");
        }
    }

}
