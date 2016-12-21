package Problem2;

import java.util.Scanner;

/**
 * Created by wzq on 12/21/16.
 */
public class Problem2 {
    public static void main(String agrs[]){
        for (int i=1;i<=100;i++){
            int times=0;
            for (int j=1;j<=i;j++){
                if(i%j==0)times++;
            }
            if(times==1||times==2)System.out.print(i+" ");
        }

    }
}
