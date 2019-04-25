package org.andestech.learning.rfb19.g4;

import static org.andestech.learning.rfb19.g4.utils.Utils.echo;

public class AppVarargs {

    private static int sum(int ... data )
    {
      int s = 0;
      for(int i =0; i< data.length; i++) s += data[i];
      return s;
    }

    private static int sum2(int[] data )
    {
        int s = 0;
        for(int i =0; i< data.length; i++) s += data[i];
        return s;
    }


    public static void main(String[] args)
    {

        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sum(new int[]{1,2,3,4,5,6,7,8,9,10}));
        echo();
        for(int i=0; i< args.length; i++) System.out.println( i + " : " + args[i]);


    }
}
