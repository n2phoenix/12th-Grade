import java.util.*;
class magicsq
{
    // 8  1  6  for size 3
    // 3  5  7    
    // 4  9  2
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter size: ");
        int n = Integer.parseInt (in.nextLine());
        int[][] mat = new int [n][n];
        int r = n - 1;
        int c = n / 2;
        mat [r] [c] = 1;

        for (int i = 2; i <= n * n; i++) 
        {
            if (mat [(r + 1) % n] [(c + 1) % n] == 0) 
            {
                r = (r + 1) % n;
                c = (c + 1) % n;
            }
            else 
                r = (r - 1 + n) % n;
                
            mat [r][c] = i;
        }
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print (mat [i][j] + " ");
                
            System.out.println();
        }
    }
}