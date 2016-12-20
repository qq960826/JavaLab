package A;

import java.io.*;
import java.util.HashMap;
/**
 * Created by wzq on 12/20/16.
 */
public class Student {
    //1 wzq 1 信息学院 123321
    public String identity;
    public  String name;
    public  String sex;
    public  String college;
    public  String password;
    public static HashMap<String,Student> loadfromfile() throws IOException {
        File file=new File("/Users/wzq/JavaLab/JavaLab6/firstweb/web/data.dat");
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
    public static HashMap<String,Student> parse(String data){
        //name identity subject score
        String data_array[]=data.split("\n");
        HashMap<String,Student> result=new HashMap<String,Student>();
        for(int i=0;i<data_array.length;i++){
            String temp_array[]=data_array[i].split(" ");
            Student student=new Student();
            student.name=temp_array[1];
            student.identity=temp_array[0];
            student.sex=temp_array[2];
            student.college=temp_array[3];
            student.password=temp_array[4];
            result.put(student.identity,student);
            //result[i]=student;

        }

        return result;
    }
}
