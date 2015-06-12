import java.util.*;
class loan
{
    Scanner in = new Scanner (System.in);
    int custid;
    String name;
    double ppal;
    double rate;
    double inst;
    double loanAmt;
    String phone;
    
    loan()                                              //Default constructor
    {   
        custid = 120;
        name = "Test Customer";
        ppal = 100000;
        rate = 10;
        inst = 10000;
        loanAmt = 110000;
        phone = "0508008008";
    }
    
    loan (int a, String b, double c, double r, String d)          //Parameterized constructor (accept parameter values)
    {
        custid = a; name = b; ppal = c; rate = r; phone = d;
        inst = (rate / 100) * ppal;
        loanAmt = ppal + inst;
    }
    
    loan (loan userDefined)                             //Parameterized constructor (accept object values)
    {
        this.custid = userDefined.custid;
        this.name = userDefined.name;
        this.loanAmt = userDefined.loanAmt;
        this.ppal = userDefined.ppal;
        this.rate = userDefined.rate;        
        this.phone = userDefined.phone;
        this.inst = userDefined.inst;
    }
    
    public void accept()
    {
        System.out.println ("Enter customer ID: ");
        custid = Integer.parseInt (in.nextLine());
        System.out.println ("Enter name: ");
        name = in.nextLine();
        System.out.println ("Enter phone number: ");
        phone = in.nextLine();
        System.out.println ("Enter principal amount: ");
        ppal = Double.parseDouble (in.nextLine());
        System.out.println ("Enter rate of interest: ");
        rate = Double.parseDouble (in.nextLine());
        in.close();              //To prevent constant flushing, the scanner is refreshed completely by closing and
                                 //reopening it.
                                 
        inst = (rate / 100) * ppal;
        loanAmt = ppal + inst;
    }
    
    public void display()
    {
        System.out.println ("Customer ID: " + custid);
        System.out.println ("Name: " + name);
        System.out.println ("Phone number: " + phone);
        System.out.println ("Principal: " + ppal);
        System.out.println ("Rate of interest: " + rate + "%");
        System.out.println ("Interest: " + inst);
        System.out.println ("Total amount: " + loanAmt);
    }
}