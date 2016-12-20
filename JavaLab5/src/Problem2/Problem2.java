package Problem2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by wzq on 12/20/16.
 */
public class Problem2 {
    public static void readFileAndDirectory(String path){
        File file=new File(path);
        System.out.println("[目录]"+file.getName());
        readFileAndDirectory(file,0);
    }
    public static void printLevel(int level){
        for(int i=0;i<level;i++){
            System.out.print("--");
        }

    }
    public static void readFileAndDirectory(File file,int level){
        level++;
        File files[]=file.listFiles();
        for(int i=0;i<files.length;i++){
            printLevel(level);
            if(files[i].isDirectory()){
                System.out.println("[目录]"+files[i].getName());
                readFileAndDirectory(files[i],level);

            }else{
                System.out.println("[文件]"+files[i].getName());

            }

        }
    }
    public static void main(String args[]) throws IOException {
        File file = new File("save");
        readFileAndDirectory("/Users/wzq/JavaLab/JavaLab5");

    }
}
