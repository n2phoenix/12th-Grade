import java.io.*;
class Square implements shapes
{
    int s;
    
    public void read() throws IOException
    {
    DataInputStream in = new DataInputStream (System.in);
    System.out.println ("Enter side of square: ");
    s = Integer.parseInt (in.readLine());
    }
    
    public int area()
    {
        return s * s;
    }
    
    public double perimeter()
    {
        return 4 * s;
    }
    
    public void print()
    {
        System.out.println ("Area: " + area());
        System.out.println ("Perimeter: " + perimeter());
    }
}