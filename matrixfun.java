import java.util.*;
class matrixfun
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int n = 0;

        while (n < 2 || n > 10)
        {
            System.out.println ("Enter size: ");
            n = Integer.parseInt (in.nextLine());

            if (n < 2 || n > 10)
                System.out.println ("Invalid value: Enter a correct size!");
        }
        int[][] mat = new int [n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.println ("Enter element at " + i + ", " + j);
                mat [i][j] = Integer.parseInt (in.nextLine());

                while (mat [i][j] < 1 || mat [i][j] > n * n)
                {
                    System.out.println ("Value should be from 1 to " + n * n + "; Enter a valid value! ");
                    mat[i][j] = Integer.parseInt (in.nextLine());
                }
            }
        }

        System.out.println ("Enter an option: ");
        System.out.println ("1. Check Wondrous square. ");
        System.out.println ("2. Saddle point. ");
        byte ch = Byte.parseByte (in.nextLine());

        switch (ch)
        {
            case 1:
            if (wondrous (mat))
                System.out.println ("Wondrous square!");
            else
                System.out.println ("Not a wondrous square!");
            break;

            case 2:
            saddle (mat);
            break;
        }
    }

    public static boolean wondrous (int mat[][])
    {
        Scanner in = new Scanner (System.in);
        int n = mat.length;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                while (mat [i][j] < 1 || mat [i][j] > n * n)
                {
                    System.out.println ("Value should be from 1 to " + n * n + "; Enter a valid value! ");
                    mat[i][j] = Integer.parseInt (in.nextLine());
                }
            }
        }

        int ans = 0;
        byte flag = 0;

        for (int i = 0; i < n; i++)         //Adding along the row
        {
            for (int j = 0; j < n; j++)
                ans += mat [i][j];

            if (ans != ((n * (n * n + 1)) / 2))
            {
                flag++;
                break;
            }
            ans = 0;
        }

        ans = 0;

        if (flag == 0)                      //Columns
        {
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    ans += mat [j][i];

                if (ans != ((n * (n * n + 1)) / 2))
                {
                    flag++;
                    break;
                }
                ans = 0;
            }
        }

        ans = 0;

        if (flag == 0)
        {
            int j = 0;
            for (int i = 0; i < n; i++, j++)
                ans += mat[i][j];

            if (ans != ((n * (n * n + 1)) / 2))
                flag++;
        }

        ans = 0;

        if (flag == 0)
        {
            int j = n - 1;
            for (int i = n - 1; i >= 0; i--, j--)
                ans += mat[i][j];

            if (ans != ((n * (n * n + 1)) / 2))
                flag++;
        }

        if (flag == 0)
            return true;
        else
            return false;
    }

    public static void saddle (int mat[][])
    {
        int n = mat.length;
        int x[] = new int [n];
        int y[] = new int [n];

        for (int i = 0; i < n; i++)         //Checking minimum value of rows
        {
            int temp = mat[i][0];
            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] < temp)
                    temp = mat[i][j];              
            }
            x[i] = temp;
        }

        for (int i = 0; i < n; i++)         //Checking maximum value of columns
        {
            int temp = mat[0][i];
            for (int j = 0; j < n; j++)
            {
                if (mat[j][i] > temp)
                    temp = mat[j][i];              
            }
            y[i] = temp;
        }

        byte flag = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (x[i] == y[j])
                {
                    flag++;
                    System.out.println ("Saddle point: " + x[i]);
                    break;
                }
            }
        }

        if (flag == 0)
            System.out.println ("No saddle point found.");
    }
}