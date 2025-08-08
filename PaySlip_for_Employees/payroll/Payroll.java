package payroll;
import employee.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

class Programmer extends Employee{
    private double bPay;
    private String des;

    public Programmer(String empId,String empName,String address,String mailId,String mobileNo,double bPay){
        super(empId,empName,address,mailId,mobileNo);
        this.bPay=bPay;
        this.des="Programmer";
    }

    public void paySlip(){
        double da=0.97*bPay;
        double hra=0.10*bPay;
        double pf=0.12*bPay;
        double staffClub=0.001*bPay;
        double gross=bPay+da+hra;
        double net=gross-(pf+staffClub);

        System.out.println("\nDesignation: "+des);
        display();
        System.out.printf("Basic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nStaff Club: %.2f\n",bPay, da, hra, pf, staffClub);
        System.out.printf("Gross Salary: %.2f\nNet Salary: %.2f\n", gross, net);
    }

}

class AssistantProfessor extends Employee{
    private double bPay;
    private String des;

    public AssistantProfessor(String empId,String empName,String address,String mailId,String mobileNo,double bPay){
        super(empId,empName,address,mailId,mobileNo);
        this.bPay=bPay;
        this.des="AssistantProfessor";
    }

    public void paySlip(){
        double da=0.97*bPay;
        double hra=0.10*bPay;
        double pf=0.12*bPay;
        double staffClub=0.001*bPay;
        double gross=bPay+da+hra;
        double net=gross-(pf+staffClub);

        System.out.println("\nDesignation: "+des);
        display();
        System.out.printf("Basic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nStaff Club: %.2f\n",bPay, da, hra, pf, staffClub);
        System.out.printf("Gross Salary: %.2f\nNet Salary: %.2f\n", gross, net);
    }
}

class AssociateProfessor extends Employee{
    private double bPay;
    private String des;

    public AssociateProfessor(String empId,String empName,String address,String mailId,String mobileNo,double bPay){
        super(empId,empName,address,mailId,mobileNo);
        this.bPay=bPay;
        this.des="AssistantProfessor";

    }

    public void paySlip(){
        double da=0.97*bPay;
        double hra=0.10*bPay;
        double pf=0.12*bPay;
        double staffClub=0.001*bPay;
        double gross=bPay+da+hra;
        double net=gross-(pf+staffClub);

        System.out.println("\nDesignation: "+des);
        display();
        System.out.printf("Basic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nStaff Club: %.2f\n",bPay, da, hra, pf, staffClub);
        System.out.printf("Gross Salary: %.2f\nNet Salary: %.2f\n", gross, net);

    }
}

class Professor extends Employee{
    private double bPay;
    private String des;

    public Professor(String empId,String empName,String address,String mailId,String mobileNo,double bPay){
        super(empId,empName,address,mailId,mobileNo);
        this.bPay=bPay;
        this.des="Professor";

    }

    public void paySlip(){
        double da=0.97*bPay;
        double hra=0.10*bPay;
        double pf=0.12*bPay;
        double staffClub=0.001*bPay;
        double gross=bPay+da+hra;
        double net=gross-(pf+staffClub);

        System.out.println("\nDesignation: "+des);
        display();
        System.out.printf("Basic Pay: %.2f\nDA: %.2f\nHRA: %.2f\nPF: %.2f\nStaff Club: %.2f\n",bPay, da, hra, pf, staffClub);
        System.out.printf("Gross Salary: %.2f\nNet Salary: %.2f\n", gross, net);

    }
}

public class Payroll {
    public static void main(String[] args) {
        try {
            PrintStream console = System.out;
            PrintStream fileOut = new PrintStream(new FileOutputStream("output.txt", true));

            ArrayList<Employee> empList = new ArrayList<>();
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number of employees:");
            int num_employees=input.nextInt();
            input.nextLine();

            for(int i=0;i<num_employees;i++){
                System.out.println("Enter the employee designation:");
                String desig=input.nextLine();

                System.out.println("Enter the employee ID:");
                String employeeId=input.nextLine();

                System.out.println("Enter the employee Name:");
                String employeeName=input.nextLine();

                System.out.println("Enter the employee address:");
                String employeeAddress=input.nextLine();

                System.out.println("Enter the employee mail ID:");
                String employeeMailId=input.nextLine();

                System.out.println("Enter the employee mobile Number:");
                String employeeMobileNo=input.nextLine();

                System.out.println("Enter the base Salary:");
                double bPay=input.nextDouble();
                input.nextLine();

                switch(desig.toLowerCase()){
                    case "programmer":
                    empList.add(new Programmer(employeeId,employeeName,employeeAddress,employeeMailId,employeeMobileNo,bPay));
                    break;

                    case "assistantprofessor":
                    empList.add(new AssistantProfessor(employeeId,employeeName,employeeAddress,employeeMailId,employeeMobileNo,bPay));
                    break;
            
                    case "associateprofessor":
                    empList.add(new AssistantProfessor(employeeId,employeeName,employeeAddress,employeeMailId,employeeMobileNo,bPay));
                    break;

                    case "professor":
                    empList.add(new AssistantProfessor(employeeId,employeeName,employeeAddress,employeeMailId,employeeMobileNo,bPay));
                    break;

                    default:
                    System.out.println("Invalid designation entered!!!");
                    break;
                }

            }

            for (Employee emp : empList){
                System.setOut(fileOut);
                emp.paySlip();
                System.out.println("--------------------------------------------------");

                System.setOut(console);
                emp.paySlip();
                System.out.println("--------------------------------------------------");
            }

            System.setOut(console);
            System.out.println("Payslips have been written to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
