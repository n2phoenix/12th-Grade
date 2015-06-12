import java.io.*;
class Record
{
    String name[] = new String [5];
    int rnk[] = new int [5];
    Record(String n[], int r[])
    {
        name = n;
        rnk = r;
    }
    
    void readvalues() throws IOException
    {
        DataInputStream in = new DataInputStream (System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println ("Enter name " + (i + 1) + ":");
            name[i] = in.readLine();
            System.out.println ("Enter rank of " + name[i] + " :");
            rnk[i] = Integer.parseInt (in.readLine());
        }
    }
    
    void display()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println ("Name: " + name[i]);
            System.out.println ("Rank: " + rnk[i]);
            System.out.println ();
        }
    }
}
        