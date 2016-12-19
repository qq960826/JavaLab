package P6;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wzq on 11/19/16.
 */
public class Stack {
    List<Object> data;
    public Stack(){
        data=new LinkedList<Object>();
    }
    public boolean isEmpty(){return data.size()==0;}
    public void push(Object obj){
        data.add(obj);
    }
    public Object pop(){
        if(!isEmpty()){
            Object obj= data.get(data.size()-1);
            data.remove(data.size()-1);
            return obj;
        }
        return null;
    }
    public Object getTop(){
        if(!isEmpty()){
            Object obj= data.get(data.size()-1);
            return obj;
        }
        return null;
    }
    public static void main(String args[]){
        Stack stack=new Stack();
        int a=123456;
        while (a!=0){
            stack.push(a&1);
            a>>=1;
        }
        while (!stack.isEmpty()){
            System.out.print((int)stack.pop());
        }

    }
}
