package Problem1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by wzq on 12/20/16.
 */
public class Problem1 {
    public static void main(String args[]) throws IOException {
        File file = new File("save");
        FileOutputStream out = new FileOutputStream(file);
        while (true){
            int num=System.in.available();
            String temp="";
            if(num!=0){
                for(int i=0;i<num;i++){
                    temp+=(char)System.in.read();
                }
                if(temp.toLowerCase().equals("exit\n"))break;
                for (int i=0;i<num;i++){
                    out.write(temp.charAt(i));
                }
                System.out.print(temp);
            }


        }
        //System.in.read();

    }
}
