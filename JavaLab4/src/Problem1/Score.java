package Problem1;

/**
 * Created by wzq on 12/19/16.
 */
public class Score implements Comparable<Score>{
    String name;
    int score;

//    @Override
//    public int compareTo(Object o) {
//        Score temp=(Score)o;
//
//        return score>temp.score?1:0;
//    }

    public Integer getScore(){return score;}
    @Override
    public int compareTo(Score o) {

        return -this.getScore().compareTo(o.getScore());
    }
}
