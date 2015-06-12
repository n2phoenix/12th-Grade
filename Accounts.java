public class Accounts
{
    protected int accno;
    protected double pr;

    Accounts(int a, double p)
    {
        accno = a;
        pr = p;
    }

    void display()
    {
        System.out.println ("Account number: " + accno);
        System.out.println ("Principal: " + pr);
    }
}

