import java.util.*;
public class EB {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Consumer number:");
        int consno=input.nextInt();
        input.nextLine();
        System.out.println("Enter the Consumer name:");
        String name=input.nextLine();
        System.out.println("Enter the previous month reading:");
        int pmr=input.nextInt();
        System.out.println("Enter the current month reading:");
        int cmr=input.nextInt();
        input.nextLine();
        System.out.println("Enter the EB connection type:");
        String type=input.nextLine();
        int units=cmr-pmr;
        double amount=calculation(units,type);

        System.out.printf("The Final EB bill amount is %.2f%n",amount);
        input.close();
    }

    public static double calculation(int units,String type){
        double amount=0;
        if(type.equalsIgnoreCase("domestic")){
            if(units<=100){
                amount=(units*1);
            }
            else if(units<=200){
                amount=(100*1)+((units-100)*2.5);
            }
            else if(units<=500){
                amount=(100*1)+(100*2.5)+((units-200)*4);
            }
            else{
                amount=(100*1)+(100*2.5)+(300*4)+((units-500)*6);
            }

        }
        else if(type.equalsIgnoreCase("commercial")){
            if(units<=100){
                amount=(units*2);
            }
            else if(units<=200){
                amount=(100*2)+(units-100)*4.5;
            }
            else if(units<=500){
                amount=(100*2)+(100*4.5)+((units-200)*6);
            }
            else{
                amount=(100*2)+(100*4.5)+(300*6)+((units-500)*7);
            }
        }
        return amount;

    }
}
