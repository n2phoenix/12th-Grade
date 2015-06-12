class Bill extends Detail
{
    int ca;
    double amt;

    Bill(String n, String a, int t, int r, int c)
    {
        super (n, a, t, r);
        ca = c;
        amt = 0.0;
    }

    void call()
    {
        if (ca > 1 && ca < 100)
            amt = rent;
        else if (ca > 101 && ca < 200)
            amt = rent + (0.60 * ca);
        else if (ca > 201 && ca < 300)
            amt = rent + (0.80 * ca);
        else if (ca > 300)
            amt = rent + ca;
    }
    
    void show()
    {
        super.show();
        call();
        System.out.println ("Number of calls: " + ca);
        System.out.println ("Amount due: " + amt);
    }
}