
class bestfour extends iscscores
{
    bestfour (int n[][])
    {
        super (n);
    }
    
        void bestsubjects()
        {
        {
            for (int i = 0; i < 6; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    if (number [j][0] > number [j+1][0])
                    {
                        int temp0 = number [j][0];
                        int temp1 = number [j][1];
                        number [j][0] = number [j + 1][0];
                        number [j][1] = number [j + 1][1];
                        number [j + 1][0] = temp0;
                        number [j + 1][1] = temp1;
                    }
                }
            }
            
            int totalPoints = 0;
            
            for (int i = 0; i < 4; i++)
                totalPoints += point (number [i][1]);
            
            System.out.println ("Total points: " + totalPoints);
            System.out.println ("Best four subject codes: ");
            
            for (int i = 0; i < 4; i++)
                System.out.println (number [i][0]);
        }
    }
}