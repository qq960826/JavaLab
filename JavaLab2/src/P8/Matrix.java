package P8;

import java.awt.*;

/**
 * Created by wzq on 11/19/16.
 */
public class Matrix {
    double data[][];
    int mwidth,mheight;
    public Matrix(int height,int width){
        mwidth=width;
        mheight=height;
        data=new double[mheight][mwidth];

    }
    public Matrix set(int row,int col,double value){
        data[row][col]=value;
        return this;
    }
    public double get(int row,int col){
        return data[row][col];
    }
    public int width(){return mwidth;}
    public int height(){return mheight;}
    public Matrix add(Matrix other){
        Matrix res=new Matrix(height(),width());
        //double res[][]=data;
        for(int i=0;i<mheight;i++){
            for(int j=0;j<mwidth;j++){
                res.set(i,j,this.data[i][j]+other.data[i][j]);
            }
        }
        return res;
    }
    public Matrix multiply(Matrix other){
        Matrix res=new Matrix(this.height(),other.width());
        for(int i=0;i<this.height();i++){
            for(int j=0;j<other.width();j++){
                int temp=0;
                for(int k=0;k<this.width();k++){
                    temp+=this.data[i][k]*other.data[k][j];

                }
                res.set(i,j,temp);
            }
        }
        return res;
    }
    public Point getMax(){
        double max=data[0][0];
        Point res=new Point();
        for(int i=0;i<height();i++){
            for(int j=0;j<width();j++){
                if(max<data[i][j]){
                    res.setLocation(i,j);
                    max=data[i][j];
                }
            }
        }
        return res;
    }
    public void print(){
        for(int i=0;i<height();i++){
            int flag=0;
            for(int j=0;j<width();j++){
                if(flag==0){
                    System.out.print(data[i][j]);
                    flag=1;
                    continue;
                }
                System.out.print(" "+data[i][j]);
            }
        }
    }


}
