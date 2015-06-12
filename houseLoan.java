import java.util.*;
class houseLoan extends loan
{
    float area;
    
    public void accept()
    {
        loan:accept();
        in = new Scanner (System.in);
        System.out.println ("Enter area: ");
        area = in.nextFloat();
    }
    
    public void display()
    {
        loan:display();
        System.out.println();
        System.out.println ("Housing Loan requested by " + name);
        System.out.println ("Area of house: " + area);
    }
}