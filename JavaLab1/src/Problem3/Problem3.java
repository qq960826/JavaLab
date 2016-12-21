package Problem3;

import java.util.Scanner;

/**
 * Created by wzq on 12/21/16.
 */
public class Problem3 {
    public static void main(String agrs[]){
        int accumulation=1,sum=0;
        for(int i=1;i<=20;i++){
            accumulation*=i;
            sum+=accumulation;
        }
        System.out.print(sum);


    }
}
