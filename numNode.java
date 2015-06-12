class numNode
{
    int a;
    numNode next;

    void create (numNode first)
    {
        int[] x = {0, 38, 49, 53};
        numNode last;
        last = first;
        last.a = 24;
        
        for (int i = 1; i <= 3; i++)
        {
            numNode temp = new numNode();
            temp.a = x[i];
            last.next = temp;
            last = temp;
        }
    }

    void insert (numNode first, newNode b1)
    {
        numNode b = new numNode();
        b.a = b1.a;
        int a = 0;
        numNode last;
        last = first;

        while (a != 2)
        {
            if (last.a < b.a && last.next.a > b.a)
            {
                numNode temp = last.next;
                last.next = b;
                b.next = temp;
            }
            last = last.next;
            a++;
        }
    }
    
    void print (numNode first)
    {
        numNode last = new numNode();
        last = first;
        
        while (last != null)
        {
            System.out.println (last.a);
            last = last.next;
        }
    }
}