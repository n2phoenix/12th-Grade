class pascaltri
{
    public static void pascal (int n)
    {
        int arr[] = new int [n + 1];
        arr [0] = 1;
        
        for (int i = 0; i < n; i++)
        {
            for (int k = 0; k < n - i; k++)
            System.out.print (" ");
            
            for (int j = 0; j <= i; j++)
            System.out.print (arr[j] + " ");
            System.out.println();
            
            for (int j = i + 1; j > 0; j--)
            arr[j] = arr[j] + arr[j - 1];
        }
    }
}
