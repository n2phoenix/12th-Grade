import java.io.*;
class Triangle implements shapes
{
    int b, h;
    
    public void read() throws IOException
    {
    DataInputStream in = new DataInputStream (System.in);
    System.out.println ("For right angle triangles only: ");
    System.out.println ("Enter base: ");
    b = Integer.parseInt (in.readLine());
    System.out.println ("Enter height: ");
    h = Integer.parseInt (in.readLine());
    }
    
    public int area()
    {
        return (int) (b * h) / 2;
    }
    
    public double perimeter()
    {
        return (double) (b + h + (b * b + h * h));
    }
    
    public void print()
    {
        System.out.println ("Area: " + area());
        System.out.println ("Perimeter: " + perimeter());
    }
}