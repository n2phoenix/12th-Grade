class Employee
{
    int empNo;
    String empName;
    String empDesig;
    
    Employee()
    {
        empNo = 1000;
        empName = "Test Employee";
        empDesig = "Software Engineer";
    }
    
    Employee(int no, String n, String d)
    {
        empNo = no;
        empName = n;
        empDesig = d;
    }
    
    void display()
    {
        System.out.println ("Employee ID: " + empNo);
        System.out.println ("Name: " + empName);
        System.out.println ("Designation: " + empDesig);
    }
}