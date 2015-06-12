class lychrel
{
    public static void main()
    {
        for (int i = 0; i < 2001; i++)
        {
            byte x = 0;
            byte flag = 0;
            long a = i;

            innerLoop:
            while (x <= 50)
            {
                if (palincheck (addDigits (a)))
                {
                    flag++;
                    break innerLoop;
                }
                else
                {
                    a = addDigits (a);
                    x++;
                }
            }

            if (flag == 0)
                System.out.println (i);
            flag = 0;
            x = 0;
            a = 0;
        }
    }

    static boolean palincheck (long x)
    {
        long b = 0;
        long n = x;
        while (x != 0)
        {
            b = b * 10;
            b = b + (x % 10);
            x /= 10;
        }

        if (n == b)
            return true;
        else
            return false;
    }

    static long addDigits (long b)
    {
        long num = b;
        long x = 0;
        while (b != 0)
        {
            x = x * 10;
            x = x + (b % 10);
            b /= 10;
        }

        return x + num;
    }
}