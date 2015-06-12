class Compute extends Library
{
    int days; double fine;
    Compute (String nn, String aa, double pp, int d)
    {
        super (nn, aa, pp);
        days = d;
    }
    
    void fine()
    {
        int x = days - 7;
        if (x <= 0)
        fine = 0;
        else if (x >= 1 && x <= 5)
        fine = x * 2.00;
        else if (x >= 6 && x <= 10)
        fine = (x - 5) * 3.00 + 10;
        else 
        fine = (x - 10) * 5.00 + 25;
    }
    
    void show()
    {
        super.show();
        System.out.println ("Total number of days: " + days);
        System.out.println ("Fine (if applicable): " + fine);
        System.out.println ("Amount: " + (0.02 * pr * days + fine));
    }
}