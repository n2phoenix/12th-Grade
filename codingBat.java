//Programs from CodingBat.com
class codingBat
{
    public boolean scoresClump(int[] scores)  //AP 1
    {
        boolean b = false;
        int i = 0;
        int j = 2;

        while (j != scores.length)
        {
            if (scores[i + 1] - scores [i] <= 2)
            {
                if (scores[j] - scores [i + 1] <= 2)
                {
                    if (scores[j] - scores [i] <= 2)
                        b = true;
                }
            }
            i++; j++;
        }

        return b;
    }

    //***************************************************************
    public int scoresSpecial(int[] a, int[] b) //AP 1
    {
        int x = biggestMultiple (a);
        int y = biggestMultiple (b);

        return (x + y);
    }

    public int biggestMultiple (int c[])
    {
        int big = 0;

        for (int i = 0; i < c.length; i++)
        {
            if (c[i] % 10 == 0)
            {
                if (c[i] > big)
                    big = c[i];
            }
        }

        return big;
    }
    //***************************************************************

    public String sameEnds(String string) //String 3
    {
        int len = string.length();
        String fin = "";
        String tmp = "";

        for (int i = 0; i < len; i++) 
        {
            tmp += string.charAt(i);
            int tmplen = tmp.length();

            if (i < len / 2 && tmp.equals(string.substring(len-tmplen,len)))
                fin = tmp;
        }

        return fin;
    }
    //***************************************************************
    
    
    public int countYZ(String str) //String 3
    {
        if(str.length() == 0)
            return 0;
        int count = 0;  

        for(int i = 0; i <= str.length() - 2; i++)
        {
            if((Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z'))
            {
            if (!Character.isLetter(str.charAt(i+1)))
            count++;
            }
        }

        char c = str.charAt(str.length() - 1);
        
        if(Character.toLowerCase(c) == 'y' || Character.toLowerCase(c) == 'z')
            count++;

        return count;
    }
}