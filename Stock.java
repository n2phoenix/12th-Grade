class Stock
{
    String item;
    int quantity;
    double rate;
    double amt;
    
    Stock(String i, int q, double r, double a)
    {
        item = i;
        quantity = q;
        rate = r;
        amt = a;
    }
    
    void display()
    {
        System.out.println ("Item: " + item);
        System.out.println ("Quantity: " + quantity);
        System.out.println ("Rate: " + rate);
        System.out.println ("Amount: " + amt);
    }
}