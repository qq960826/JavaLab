package P2;

import P2.sdkd.Teacher;
import P2.sdkd.TeacherManagement;

import java.util.Arrays;

/**
 * Created by wzq on 11/18/16.
 */
public class Main {
    public static void main(String args[]){
        Teacher teachers[]=new Teacher[3];
        teachers[0]=new Teacher().setAge(23).setName("WZQ3").setNo(3).setSeminary("计院");
        teachers[1]=new Teacher().setAge(23).setName("WZQ1").setNo(1).setSeminary("计院");
        teachers[2]=new Teacher().setAge(23).setName("WZQ2").setNo(2).setSeminary("计院");
        Arrays.sort(teachers);
        System.out.print(teachers[0].toString());


        TeacherManagement teacherManagement=new TeacherManagement();
        teacherManagement.data.add(new Teacher().setAge(21).setName("WZQ1").setNo(1).setSeminary("计院"));
        teacherManagement.data.add(new Teacher().setAge(23).setName("WZQ3").setNo(3).setSeminary("计院"));
        teacherManagement.data.add(new Teacher().setAge(22).setName("WZQ2").setNo(2).setSeminary("计院"));
        System.out.print(teacherManagement.search("WZQ"));
    }

}
