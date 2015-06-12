class Simple extends Accounts
{
    double rt; int time; double it;
    Simple (int acc, double pp, double rr, int tt)
    {
        super (acc, pp);
        rt = rr;
        time = tt;
    }

    void calc()
    {
        it = ((pr * rt * time) / 100);
    }

    void display()
    {
        super.display();
        System.out.println ("Rate: " + rt);
        System.out.println ("Time: " + time);
        System.out.println ("Simple Interest: " + it);
    }
}