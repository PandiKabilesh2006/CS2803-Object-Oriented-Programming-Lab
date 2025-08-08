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
            PrintStream console = System.out;
            PrintStream fileOut = new PrintStream(new FileOutputStream("output.txt", true));

            ArrayList<Employee> empList = new ArrayList<>();
            empList.add(new Programmer("Hemanth Kumar", "P101", "Chennai", "hemanthkumar2006@gmail.com","9876543210", 40000));
            empList.add(new AssistantProfessor("Rishie Hrithick", "A201", "Thanjavur", "rishiehrithick2007@gmail.com","9876500000", 50000));
            empList.add(new AssociateProfessor("Shravan", "AP301", "Coimbatore", "shravan2007@gmail.com","9876511111", 60000));
            empList.add(new Professor("Pandi Kabilesh", "PRO401", "Madurai", "pandikabilesh2006@gmail.com", "9876522222",70000));

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
