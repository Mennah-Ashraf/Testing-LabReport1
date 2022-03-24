public class equilibrium {
    public int equilibrium (int n, int[][] arr)   //n is number of lines
    {
        if (n<1 || n> 100)    //1 ≤ n ≤ 100
        {
            System.out.println("WARNING:");
            System.out.println("******* WRONG NO. OF LINES ENTERED *******");
            System.out.println("NO. OF LINES (n) RANGE: (1 ≤ n ≤ 100)");
            return -1;
        }

        else
        {
            int [] sum ={0,0,0};

            for(int i=0; i < n ; i++)        //i = row
            {
                for (int j=0; j < 3 ; j++)  //j = column
                {
                    int x = arr[i][j];
                    sum[j] += x;            // Sum of column items
                }
            }


            if (sum[0]==0 && sum[1]==0 && sum[2]==0){
                System.out.println("YES");
                return 1;
            }

            else
            {
                System.out.println("NO");
                return 0;
            }

        }
    }
}

