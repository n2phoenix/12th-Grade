import java.util.*;
class array2Dop
{
    int mat[][];
    int r, c;

    void read()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter rows: ");
        r = Integer.parseInt (in.nextLine());
        System.out.println ("Enter columns: ");
        c = Integer.parseInt (in.nextLine());

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.println ("Enter element at " + i + ", " + j);
                mat[i][j] = Integer.parseInt (in.nextLine());
            }
        }
    }

    void print()
    {
        if (mat == null)
            System.out.println ("ERROR: Matrix not initialized!");
        else
        {
            for (int i = 0; i < r; i++)
            {
                for (int j = 0; j < c; j++)
                    System.out.print (mat[i][j] + " ");
                    System.out.println();
            }
        }
    }
}