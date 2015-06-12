import java.io.*;
class Rectangle implements shapes
{
    int l, b;
    
    public void read() throws IOException
    {
    DataInputStream in = new DataInputStream (System.in);
    System.out.println ("Enter length: ");
    l = Integer.parseInt (in.readLine());
    System.out.println ("Enter breadth: ");
    b = Integer.parseInt (in.readLine());
    }
    
    public int area()
    {
        return l * b;
    }
    
    public double perimeter()
    {
        return (double) (l + b);
    }
    
    public void print()
    {
        System.out.println ("Area: " + area());
        System.out.println ("Perimeter: " + perimeter());
    }
}