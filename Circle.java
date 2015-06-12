import java.io.*;
class Circle implements shapes
{
    int r;
    
    public void read() throws IOException
    {
    DataInputStream in = new DataInputStream (System.in);
    System.out.println ("Enter radius: ");
    r = Integer.parseInt (in.readLine());
    }
    
    public int area()
    {
        return (int) (pi * r * r);
    }
    
    public double perimeter()
    {
        return (double) (2 * pi * r);
    }
    
    public void print()
    {
        System.out.println ("Area: " + area());
        System.out.println ("Perimeter: " + perimeter());
    }
}