package payroll;
import employee.Employee;
import java.io.*;
import java.util.ArrayList;

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
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt", true));
            System.setOut(new PrintStream(new FileOutputStream("output.txt", true)));
            ArrayList<Employee> empList = new ArrayList<>();
            empList.add(new Programmer("Karthik", "P101", "Chennai", "karthik@mail.com","9876543210", 40000));
            empList.add(new AssistantProfessor("Priya", "A201", "Madurai", "priya@mail.com","9876500000", 50000));
            empList.add(new AssociateProfessor("Ram", "AP301", "Coimbatore", "ram@mail.com","9876511111", 60000));
            empList.add(new Professor("Sita", "PRO401", "Trichy", "sita@mail.com", "9876522222",70000));
            for (Employee emp : empList) {
                emp.paySlip();
                System.out.println("--------------------------------------------------");
            writer.close();
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
