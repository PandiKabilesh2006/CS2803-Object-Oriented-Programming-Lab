import java.util.*;
import java.io.*;
public class Library_Overdue_Fine{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Student ID:");
        int student_id=input.nextInt();
        input.nextLine();
        System.out.println("Enter the Student Name:");
        String student_name=input.nextLine();
        System.out.println("Enter the Book ID:");
        int book_id=input.nextInt();
        input.nextLine();
        System.out.println("Enter the title of the book:");
        String book_title=input.nextLine();
        System.out.println("Enter the number of days book was kept:");
        int num_days=input.nextInt();
        input.nextLine();
        System.out.println("Enter the Book type (General/Reference):");
        String book_type=input.nextLine();
        int fine=Fine(num_days,book_type);



    }

    public static int Fine(int num_days,String book_type){
        int fine=0;
        if(book_type.equalsIgnoreCase("General")){
            if(num_days<=7){
                fine=0;
            }
            else if(num_days<=14){
                fine=((num_days-7)*2);
            }
            else if(num_days<=30){
                fine=(7*0)+(7*2)+((num_days-14)*5);
            }
            else{
                fine=(7*0)+(7*2)+(16*5)+((num_days-30)*10);
            }
        }
        else if(book_type.equalsIgnoreCase("Reference")){
            fine=(num_days*10);

        }
        else{
            System.out.println("");
        }


        return fine;

    }
}