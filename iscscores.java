class iscscores
{
    protected int number[][] = new int [6][2];

    iscscores (int n [][])
    {
        number = n;
    }

    int point (int a)
    {
        int m = a;
        int x = -1;
        if (m >= 90 && m <= 100)
        {
            x = 1;
        }
        else if (m >= 100)
        {
            System.out.println ("ERROR - marks cannot be more than 100!");
            x = 0;
        }

        else if (m >= 80 && m <= 89)
            x = 2;

        else if (m >= 70 && m <= 79)
            x = 3;

        else if (m >= 60 && m <= 69)
            x = 4;

        else if (m >= 50 && m <= 59)
            x = 5;

        else if (m >= 40 && m <= 49)
            x = 6;

        return x;
    }
}
