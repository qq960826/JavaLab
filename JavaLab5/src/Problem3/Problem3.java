package Problem3;

import java.io.*;
import java.util.Scanner;

/**
 * Created by wzq on 12/20/16.
 */
public class Problem3 {
    public static Student[] parse(String data){
        //name identity subject score
        String data_array[]=data.split("\n");
        Student[] result=new Student[data_array.length];
        for(int i=0;i<data_array.length;i++){
            String temp_array[]=data_array[i].split(" ");
            Student student=new Student();
            student.name=temp_array[0];
            student.identity=Integer.parseInt(temp_array[1]);
            student.subject=temp_array[2];
            student.score=Integer.parseInt(temp_array[3]);
            result[i]=student;
        }
        return result;
    }
    public static Student[] loadfrominput(){
        Scanner scanner=new Scanner(System.in);
        String total="";
        while (true){
            String temp=scanner.nextLine();
            if(temp.toLowerCase().contains("exit"))break;
            total+=temp+"\n";
        }
        return parse(total);
    }
    public static void savetofile(Student students[]) throws IOException {
        String res="";
        int a=students.length;
        for (int i=0;i<students.length;i++){
            res+=students[i].name+" "+students[i].identity+" "+students[i].subject+" "+students[i].score+"\n";

        }
        File file=new File("data.dat");
        FileOutputStream out=new FileOutputStream(file);
        for(int i=0;i<res.length();i++){
            out.write(res.charAt(i));
        }
    }
    public static Student[] loadfromfile() throws IOException{
        File file=new File("data.dat");
        FileInputStream fileInputStream=new FileInputStream(file);
        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String data="";
        String lineTxt = null;
        while ((lineTxt = bufferedReader.readLine()) != null){
            data+=lineTxt+"\n";
        }
        return parse(data);
    }
    public static void print(Student students[]){
        String res="";
        for (int i=0;i<students.length;i++){
            res+=students[i].name+" "+students[i].identity+" "+students[i].subject+" "+students[i].score+"\n";

        }
        System.out.print(res);
    }
    public static void main(String args[]) throws IOException {
        /*
        testcase:
        wwzq 2 chemistry 95
        wzq 2 phywsics 100
        exit
         */
        Student students[]=loadfrominput();
        savetofile(students);
        students=loadfromfile();
        print(students);

    }
}
