class test
{
    static int find (int n, int p)
    {
        if (n == 0)
        return p;
        else
        return find (p % n, n);
    }
    
    static void perform (int m)
    {
        int q = 14;
        int x = find (q++, ++m);
        System.out.println (x);
    }
}