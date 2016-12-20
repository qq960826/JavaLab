package Problem1;

import java.util.*;

/**
 * Created by wzq on 12/19/16.
 */
public class Problem1 {
    public static void main(String args[]){
        List<Score> scores=new ArrayList<Score>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Continue to record score to press Y or N");
            String iscontinue=scanner.next();
            if (iscontinue.equals("Y")){
                Score score=new Score();
                score.name=scanner.next();
                score.score=Integer.parseInt(scanner.next());
                scores.add(score);
            }else{
                break;
            }
        }
        Collections.sort(scores);
        System.out.println("Name            Score");
        for (int i=0;i<scores.size();i++){
            Score temp=scores.get(i);
            System.out.println(temp.name+"            "+temp.score);
        }


    }

}
