class Compound extends Accounts
{
    double rt; int time; double it;
    Compound (int acc, double pp, double rr, int tt)
    {
        super (acc, pp);
        rt = rr;
        time = tt;
    }

    void calc()
    {
        it = (pr * Math.pow (1 + (rt/100), time)) - pr;
    }

    void display()
    {
        super.display();
        System.out.println ("Rate: " + rt);
        System.out.println ("Time: " + time);
        System.out.println ("Compound Interest: " + it);
    }
}