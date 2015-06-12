class Salary extends Employee
{
    float basic;
    
    Salary()
    {
        super();
        basic = 10000;
    }
    
    Salary (int no, String n, String d, float b)
    {
        super (no, n, d);
        basic = b;
    }
    
    void calculate()
    {
        double da, hra, sal, pf, net;
        da = (50/100) * basic;
        hra = (15/100) * basic;
        sal = basic + da + hra;
        pf = (8/100) * sal;
        net = sal - pf;
        System.out.println ("Dearness allowance: " + da);
        System.out.println ("House rent allowance: " + hra);
        System.out.println ("Salary: " + sal);
        System.out.println ("Provident fund: " + pf);
        System.out.println ("Net salary: " + net);
    }
}