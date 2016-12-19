package P2.sdkd;

import java.util.Comparator;

/**
 * Created by wzq on 11/18/16.
 */
public class Teacher implements Comparator,Comparable {
    int no;

    public String getName() {
        return name;
    }

    int age;
    String seminary;
    String name;
    public Teacher setSeminary(String seminary) {

        this.seminary = seminary;
        return this;
    }

    public Teacher setNo(int no) {
        this.no = no;
        return this;
    }

    public int getNo() {
        return no;
    }


    public Teacher setName(String name) {
        this.name = name;
        return this;
    }


    public Teacher setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }


    public String getSeminary() {
        return seminary;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return ((Teacher)o1).getAge()>((Teacher)o2).getAge()?1:0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        return no == teacher.no;

    }


    @Override
    public String toString() {
        return
                "编号为" + no + "、姓名为" + name + "、年龄为" + age  + "的"+seminary+"学院老师";
    }


    @Override
    public int compareTo(Object o) {
        Teacher teacher=(Teacher)o;

        return this.getNo()-teacher.getNo();
    }
}
