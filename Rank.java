class Rank extends Record
{
    int index;
    Rank(String n[], int r[])
    {
        super (n, r);
        index = 0;
    }

    void highest()
    {
        int temp = rnk[0];
        for (int i = 0; i < 5; i++)
        {
            if (temp < rnk [i])
            {
                temp = rnk[i];
                index = i;
            }
        }
    }

    void display()
    {
        super.display();
        System.out.println ("Highest rank holder: " + name[index]);
        System.out.println ("Rank: " + rnk[index]);        
    }
}