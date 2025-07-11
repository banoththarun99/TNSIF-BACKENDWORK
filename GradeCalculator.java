import java.util.Scanner;

public class GradeCalculator {

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Student Name : ");
        String name=sc.next();
        if (!name.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid name. Please use only letters and spaces.");
            sc.close();
            return;
        }        
        

        System.out.println("Enter the branch : ");
        String branch=sc.next();
        if (!branch.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid branch. Please use only letters and spaces.");
            sc.close();
            return;
        }        

       int marks1;
        System.out.print("Enter the marks of Subject1: ");
        if (sc.hasNextInt()) {
           marks1 = sc.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            sc.close();
            return;
        }
        

        int marks2;
        System.out.print("Enter the marks of Subject1: ");
        if (sc.hasNextInt()) {
           marks2 = sc.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            sc.close();
            return;
        }

       int marks3;
        System.out.print("Enter the marks of Subject1: ");
        if (sc.hasNextInt()) {
           marks3 = sc.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            sc.close();
            return;
        }

        int total = (int) (marks1 + marks2 + marks3);
        float average = (float)total/3;

        char grade;

        if(average >=90){
            grade='A';
        }else if(average >=75 && average<90){
            grade='B';

        }else if(average >=65 && average < 75 ){
            grade = 'C';

        }else if(average >=55 && average <65){
            grade = 'D';

        }else{
            grade='F';
        }
       
        System.out.println("\n ---student result---");
        System.out.println("Branch : " +branch);
        System.out.println("Name : " +name);
        System.out.println("Total Marks : " + total);
        System.out.println("Average : " +average);
        System.out.println("Grade : " +grade);
        sc.close();
    }
 }
    

