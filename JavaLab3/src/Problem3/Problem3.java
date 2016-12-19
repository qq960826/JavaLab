package Problem3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wzq on 12/19/16.
 */

public class Problem3 {
    //北京烤鸭：189 西芹百合：15 清蒸鲈鱼：80
    public static void main(String args[]){
        List<Food> foods=new LinkedList<Food>();
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String input_array[]=input.split(" ");
        for (int i=0;i<input_array.length;i++){
            String temp[]=input_array[i].split("：");
            Food food=new Food();
            food.name=temp[0];
            food.price=Integer.parseInt(temp[1]);
            foods.add(food);
        }
        int sum=0;
        System.out.println("Name:"+"          "+"Price");
        for(int i=0;i<foods.size();i++){
            Food food=foods.get(i);
            sum+=food.price;
            System.out.println(food.name+"          "+food.price);

        }
        System.out.println("Total:          "+sum);
    }
}
