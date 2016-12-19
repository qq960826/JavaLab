package P7;

/**
 * Created by wzq on 11/19/16.
 */
public class P7 {
    public static void main(String args[]){
        int matrix[][]=new int[5][];
        for(int i=0;i<5;i++){
            matrix[i]=new int[i];
            for(int j=0;j<i;j++){
                matrix[i][j]=i*j;
            }
        }

        for(int i=0;i<matrix.length;i++){
            System.out.print("<");
            int flag=0;
            for(int j=0;j<matrix[i].length;j++){
                if(flag==0){
                    System.out.print(matrix[i][j]);
                    flag=1;
                    continue;
                }
                System.out.print(" "+matrix[i][j]);

            }
            System.out.print(">\n");
        }

    }
}
