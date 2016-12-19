package P1.figure;

/**
 * Created by wzq on 11/18/16.
 */
public class Rectangle {
    double mlength;
    double mwidth;
    public Rectangle set_length(double length){
        mlength=length;
        return this;
    }
    public Rectangle set_width(double length){
        mwidth=length;
        return this;
    }
    public double get_length(){return  mlength;}
    public double get_width(){return  mlength;}
    public double calculate_girth(){return 2*(mlength+mwidth);}
    public double calculate_area(){return mlength*mwidth;}


}
