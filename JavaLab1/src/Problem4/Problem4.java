package Problem4;

import java.util.Scanner;

/**
 * Created by wzq on 12/21/16.
 */
public class Problem4 {
    public static int getmax(int num){
        int max=0;
        while (num>0){
            int temp=num%10;
            max=max>temp?max:temp;
            num/=10;
        }
        return max;
    }
    public static void main(String agrs[]){
        Scanner scanner=new Scanner(System.in);
        int data=scanner.nextInt();
        System.out.print(getmax(data));


    }

}
