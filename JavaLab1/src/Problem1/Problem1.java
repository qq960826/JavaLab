package Problem1;

import java.util.Scanner;

/**
 * Created by wzq on 12/21/16.
 */
public class Problem1 {
    public static void main(String agrs[]){
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }

    }
}
