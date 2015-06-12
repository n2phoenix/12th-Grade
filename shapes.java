import java.io.*;
interface shapes
{
double pi = 3.14;
DataInputStream in = new DataInputStream (System.in);
void read() throws IOException;
int area();
double perimeter( );
void print();
}