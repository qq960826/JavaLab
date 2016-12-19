package P2.sdkd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzq on 11/18/16.
 */
public class TeacherManagement {
    public List<Teacher> data = new ArrayList<Teacher>();
    public String search(String name){
        Teacher res=null;
        for(int i=0;i<data.size();i++){
            if(data.get(i).getName().equals(name)){
                res=data.get(i);
                return res.toString();
            }
        }
        //System.out.print();

        return "没有符合条件的教师";

    }
}
