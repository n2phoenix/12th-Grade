class Purchase extends Stock
{
    int pqty;
    double prate;
    
    Purchase (String i, int q, double r, double a, int pq, double pr)
    {
        super (i, q, r, a);
        pqty = pq;
        prate = pr;
    }
    
    void update()
    {
        quantity += pqty;
        rate = prate;
    }
    
    void display()
    {
        super.display();
        update();
        System.out.println();
        super.display();
    }
}