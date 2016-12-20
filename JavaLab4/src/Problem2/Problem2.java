package Problem2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by wzq on 12/20/16.
 */
public class Problem2 {
    public static double getSum(HashMap books){
        Iterator iterator=books.entrySet().iterator();
        double result=0;
        while (iterator.hasNext()){
            Map.Entry enrty=(Map.Entry) iterator.next();
            Book book=(Book) enrty.getValue();
            result+=book.num*book.price;
        }
        System.out.println("the total price is "+result);
        return result;
    }
    public static void main(String args[]){
        /*
        test case:

        2
        人生智慧 20.5 2
        浪潮之巅 10.5 3
         */
        HashMap<String,Book> map=new HashMap<String,Book>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the num of books");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            Book temp=new Book();
            temp.name=scanner.next();
            temp.price=scanner.nextDouble();
            temp.num=scanner.nextInt();
            map.put(temp.name,temp);
        }
        getSum(map);
    }

}
