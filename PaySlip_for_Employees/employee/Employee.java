package employee;

public class Employee{
    protected String empId,empName,address,mailId,mobileNo;

    public Employee(String empId,String empName,String address,String mailId,String mobileNo){
        this.empId=empId;
        this.empName=empName;
        this.address=address;
        this.mailId=mailId;
        this.mobileNo=mobileNo;
    }

    public void display(){
        System.out.println("Employee ID: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Address :"+address);
        System.out.println("Mail ID: "+mailId);
        System.out.println("Mobile Number: "+mobileNo);

    }

    public void paySlip(){
        
    }
}