package classwork_four_one;

import java.util.*;

public class main
{ //start of CSA_PROJECTS
//   /*
//        Name: Samuel Sparenga
//        Title: 4.1
//        Date: 10/08/2018
//   */   
    public static void main(String args[]) 
    { //start of Main
        
        final int NUM_FLIPS = 1000;
        int heads = 0, tails = 0;
        
        Coin myCoin = new Coin();
        
        for(int count = 1; count <= NUM_FLIPS; count++)
        {
            myCoin.flip();
            
            if(myCoin.isHeads())
            {
                heads++;
            }
            else
            {
                tails++;
            }
        }
        
        System.out.println("The number of total flips: " + NUM_FLIPS);
        System.out.println("The number of heads: " + heads);
        System.out.println("The number of tails: " + tails);
             
    } //end of Main

} //end of CSA_WORK

