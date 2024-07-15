import java.util.Scanner;

public class Q1CompareNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        
        if(number1 > number2 ){
            System.out.println(number1 + " is greater than " + number2);
        }else if(number2 > number1){
            System.out.println(number2 + " is greater than " + number1);
        }else{
            System.out.println("They are equal");
        }

        scanner.close();
        return;

    }
}