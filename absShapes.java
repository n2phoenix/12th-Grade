import java.util.*;
abstract class absShapes
{ 
int x,y;
abstract void read();
abstract int area();
abstract double perimeter();
void print()
{
System.out.println("Area :" + area());
System.out.println("Perimeter :"+perimeter());
}
}