public class Watermelon {
    public int watermelon(int w)   // w is weight
    {
       if (w<1 || w> 100)  //1 ≤ w ≤ 100
       {
           System.out.println("WARNING:");
           System.out.println("**********WRONG Entered weight********");
           System.out.println("The weight RANGE:(1 ≤ w ≤ 100)");
           return -1;
       }

       else{
           if (w%2 ==0 && w!=2)
           {
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
