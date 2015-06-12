import java.util.*;
class absTriangle extends absShapes
{
    void read()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter base: ");
        x = Integer.parseInt (in.nextLine());
        System.out.println ("Enter height: ");
        y = Integer.parseInt (in.nextLine());
        print();
    }
    
    int area()
    {
        return (int) 0.5 * x * y;
    }
    
    double perimeter()
    {
        return (double) (x + y + ((x*x) + (y*y)));
    }
}