import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        
        double num1;
        double num2;
        double result;
        char operator;
        
        Scanner reader = new Scanner(System.in);
        System.out.println(" Enter the first number : ");
        num1=reader.nextDouble();

        System.out.println("Enter the second number : ");
        num2 = reader.nextDouble();

        System.out.println("\n enter the operator (+,-,*,/,%) : ");
        operator=reader.next().charAt(0);

        switch (operator){

            case '+' :
            result=num1+num2;
            break;

            case '-' :
            result=num1-num2;
            break;

            case '*' : 
            result=num1*num2;
            break;

            case '/' :
            if(num2==0){
                System.out.println("Error! cannot divide by zero");
                reader.close();
                return;
            }
            result=num1/num2;
            break;

            case '%':
            result=num1%num2;
            break;

            default :
            System.out.println("Error! enter the correct operator");
            reader.close();
            return;
         }
         System.out.printf("\nThe result is: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
         reader.close();
        
         }
    
}