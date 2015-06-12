import java.util.*;
public class sortingPrograms 
{
    static int val = 0;
    static int[] a;
    sortingPrograms()
    {
    val = 5;    
    }
    
    sortingPrograms (int x)
    {
        val = x;
    }
    
    sortingPrograms (int[] a)
    {
        this.a = a;
        val = a.length;
    }
    
    public static void main()
    {
        Scanner in = new Scanner (System.in);
                
        if (a == null)
        {
        a = new int [5];
        System.out.println ("Enter array data: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println ("Enter element at " + i);
            a[i] = in.nextInt();
        }
        }

        //Asking user
        System.out.println ("Use selection sort? Type 1.");
        System.out.println ("Use bubble sort? Type 2.");
        byte ch = in.nextByte();

        switch (ch)
        {
            case 1:
            selectionSort (a);
            display(a);
            break;
            
            case 2:
            bubbleSort (a);
            display(a);
            break;
            
            default:
            System.out.println ("Enter a proper value!");
            break;
        }
    }

    public static void selectionSort (int[] a) //For one dimensional integer arrays
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (a[i] < a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort (int[] a)
    {
        int k;
        boolean b = false;
        
        outerLoop:              //Labelling the loop
        for (int m = a.length; m >= 0; m--) 
        {
            for (int i = 0; i < a.length - 1; i++) 
            {
                k = i + 1;
                if (a[i] > a[k]) 
                {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                    b = true;
                }
            }
        }
    }
    
    public static void display (int[] a)
    {
        for (int i = 0; i < 5; i++)
            System.out.print (a[i] + " ");
    }
}
