import java.io.*;
class hello
{
    public static void main(int n) throws IOException
    {
        DataInputStream in = new DataInputStream (System.in);
        int arr []= new int [n];
        for (int i = 0; i < n; i++)
            arr [i] = Integer.parseInt (in.readLine());
        System.out.println();
        int k = n;

        for (int i = 0; i < k + i; i++)
        {
            for (int j = 0; j < k; j++)
                System.out.print (arr[j] + "\t");

            System.out.println();

            for (int j = 0; j < k - 1; j++)
                arr[j] = arr[j + 1] - arr [j];

            k--;
        }
    }
}