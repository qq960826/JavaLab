package P1.figure;

/**
 * Created by wzq on 11/18/16.
 */
public class Circle {
    public Circle(){};
    final double pi=3.14159226;
    double mradius;
    public Circle set_radius(double radius){mradius=radius;return this;}
    public double get_radius(){return pi;}
    public double calculate_girth(){return 2*pi*mradius;}
    public double calculate_area(){return pi*mradius*mradius;}

}
