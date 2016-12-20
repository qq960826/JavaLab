package Problem3;

import java.util.*;

/**
 * Created by wzq on 12/20/16.
 */
public class Problem3 {
    public static HashMap<Integer,Integer> genetaterandom(int range, int num){
        Random random =new Random();

        int pos[]=new int[range];
        for(int i=0;i<pos.length;i++)pos[i]=-1;
        int nums=num;
        while (nums>0){
            int temp=random.nextInt(range);
            if(pos[temp]==-1){
                pos[temp]=1;
                nums--;
            }
        }
        HashMap<Integer,Integer> result=new HashMap<Integer,Integer>();
        for (int i=0;i<range;i++){
            if(pos[i]!=-1){
                result.put(i,i);
            }
        }
        return result;
    }
    public static String compate(HashMap<Integer,Integer> answer,int res[]){
        int sum=0;
        for (int i=0;i<res.length;i++){
            if(answer.containsKey(res[i]))sum++;
        }
        if(sum==7)return "一等奖";
        if(sum==6)return "二等奖";
        if(sum==5)return "三等奖";
        return "没有奖";
    }
    public static void main(String args[]){
        HashMap<Integer,Integer> answer=genetaterandom(30,7);
        Scanner scanner=new Scanner(System.in);
        int res[]=new int[7];
        for (int i=0;i<7;i++){
            int temp=scanner.nextInt();
            res[i]=temp;
        }
        System.out.println(compate(answer,res));

    }
}
