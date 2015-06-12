import java.util.*;
class absRect extends absShapes
{
    void read()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter length: ");
        x = Integer.parseInt (in.nextLine());
        System.out.println ("Enter breadth: ");
        y = Integer.parseInt (in.nextLine());
        print();
    }
    
    int area()
    {
        return x * y;
    }
    
    double perimeter()
    {
        return (double) (x + y);
    }
}