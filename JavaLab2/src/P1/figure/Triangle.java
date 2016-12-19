package P1.figure;

/**
 * Created by wzq on 11/18/16.
 */
public class Triangle {
    double a,b,c;
    public Triangle set_a(double data){a=data;return this;}
    public Triangle set_b(double data){b=data;return this;}
    public Triangle set_c(double data){c=data;return this;}

    public double get_a(){return a;}
    public double get_b(){return b;}
    public double get_c(){return c;}
    public double calculate_girth(){return a+b+c;}
    public double calculate_area(){
        double p=calculate_girth()/2;
        double temp=p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(temp);
    }


}
