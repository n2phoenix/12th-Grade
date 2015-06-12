class spearman
{
    public static void main () 
    {
        int xi[] = {106,86,100,101,99,103,97,113,112,110};
        int yi[] = {7,0,27,50,28,29,20,12,6,17};
        int temp=0;
        int xr[] = {1,2,3,4,5,6,7,8,9,10};
        int yr[] = {1,2,3,4,5,6,7,8,9,10};
       
        for(int i=0 ; i< yi.length ; i++)
        {
            for(int j=0 ; j< yi.length-1 ;j++)
            {
                if(yi[j]>yi[j+1])
                {
                    
                    temp = yi[j];
                    yi[j] = yi[j+1];
                    yi[j+1] = temp;
                    
                    temp = xi[j];
                    xi[j] = xi[j+1];
                    xi[j+1] = temp;
                }
            }
        }
        
        for(int i=0 ; i< xi.length ; i++)
        {
            for(int j=0 ; j< xi.length-1 ;j++)
            {
                if(xi[j]>xi[j+1])
                {
                    temp = xi[j];
                    xi[j] = xi[j+1];
                    xi[j+1] = temp;
                    
                    temp = yi[j];
                    yi[j] = yi[j+1];
                    yi[j+1] = temp;
                    
                    temp = yr[j];
                    yr[j] = yr[j+1];
                    yr[j+1] = temp;
                }
            }
        }

        int di[] = new int [10];
        int ds[] = new int [10];
        int sum=0; 
        int n = xi.length;
        
        for(int i = 0; i < 10; i++)
        {
            di[i] = xr[i]-yr[i];
            ds[i] = (int)Math.pow(di[i],2);
            sum = ds[i] + sum;
        }
        
        double p = 1 - ((6 * sum)/(n*((Math.pow(n,2))-1)));
        
        System.out.println(p);
    }
}