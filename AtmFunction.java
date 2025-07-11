import java.util.Scanner;

public class AtmFunction {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            double balance=1000.00;
            
            int choice;
    
            while(true){
                System.out.println("\n ---ATM Menu--");
                System.out.println("1.Check Balance");
                System.out.println("2.Deposite");
                System.out.println("3.Withdraw");
                System.out.println("4.Exit");
                System.out. println("Select the Option :");
                
                choice = sc.nextInt();               

                switch(choice){
                    case 1:
                    System.out.println("Your Balance : "+balance);
                    break;
                    case 2:
                    System.out.println("Enter the amount you want to deposite : ");
                    double deposite=sc.nextDouble();
                    if(deposite>0){
                        balance += deposite;
                        System.out.println("Deposite Succesfull");
                    }else{
                        System.out.println("Invalid Amount");
                        
                    }
                    break;                   
                        case 3:
                        System.out.println("Enter the amount to Withdraw : ");
                        double withdraw=sc.nextDouble();
                        if(withdraw>0 && withdraw<=balance){
                            balance -= withdraw;
                            System.out.println("Withdraw is Successfull and Collect your Amount");
                        
                        }else{
                            System.out.println("Insuffent Balance");
                            
                            
                        }
                        break;

                        case 4:
                        System.out.println("Thanyou for using the ATM ");
                        System.exit(0);

                        default:
                        System.out.println("Invalid Option! Please try again");
                
                }
               
            }
        }
      
    }

}
