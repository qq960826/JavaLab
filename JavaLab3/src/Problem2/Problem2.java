package Problem2;

import java.util.Random;

/**
 * Created by wzq on 12/19/16.
 */
public class Problem2 {
    public static String[] getRandomTeachers(String[] teachers, int n){
        Random random =new Random();
        String result[]=new String[n];
        int pos[]=new int[teachers.length];
        for(int i=0;i<pos.length;i++)pos[i]=-1;
        int nums=n;
        while (nums>0){
            int temp=random.nextInt(teachers.length);
            if(pos[temp]==-1){
                pos[temp]=1;
                nums--;
            }
        }
        int loca=0;
        for (int i=0;i<n;i++){
            if(pos[i]!=-1){
                result[loca]=teachers[i];
                loca++;
            }

        }
        return result;
    }
    public static void main(String args[]){

    }


}
