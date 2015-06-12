class martingarrix //Martin's Rule man :P
{                  //For simultaneous linear equations
    //Sample equations --- (x = 2), (y = -1)
    //2x - 3y = 7
    //4x - 5y = 13
    double[][] mat = new double [2][2];
    double[] c = new double [2];
    double x, y;

    martingarrix()
    {
        int k = 0;
        int[] ele = {2, 3, 4, 5};
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                mat [i][j] = (double) ele [k];
                k++;
            }
        }
        
        c[0] = 7;
        c[1] = 8;
    }

    martingarrix (int el[], int a, int b)
    {
        int k = 0;
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                mat [i][j] = (double) el [k];
                k++;
            }
        }
        c[0] = a;
        c[0] = b;
    }

    void inverse()                                              // [2   -3] - is the original
    {                                                           // [4   -5] - matrix.
        double d = det();
        int t = (int) mat [0][0];       //Adjoint of matrix
        mat [0][0] = mat [1][1];
        mat [1][1] = t;
        
        mat [0][1] = - mat [0][1];
        mat [1][0] = - mat [1][0];
        
        for (int i = 0; i < 2; i++)     //Multiplying by inverse determinant
        {
            for (int j = 0; j < 2; j++)
            {
                mat [i][j] *= (1/d);
            }
        }
    }

    double det()
    {
        return ((mat [0][0] * mat [1][1]) - (mat [1][0] * mat [0][1]));
    }
    
    void calc()
    {
        inverse();
        double ans[] = new double [2];
        
        for (int i = 0; i < 2; i++)
            ans [i] = mat[i][0] * c[0] + mat[i][1] * c[1];
            
        System.out.println ("Value of x = " + ans[0]);
        System.out.println ("Value of y = " + ans[1]);
    }
}