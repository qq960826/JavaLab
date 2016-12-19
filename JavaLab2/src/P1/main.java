package P1; /**
 * Created by wzq on 11/18/16.
 */

import P1.figure.Circle;
import P1.figure.Rectangle;
import P1.figure.Triangle;

public class main {
    public static void main(String args[]){
        Circle circle=new Circle();
        circle.set_radius(10);
        System.out.print("the girth of Circle is "+circle.calculate_girth()+",the are of Circle is "+circle.calculate_area()+"\n");

        Rectangle rectangle=new Rectangle();
        rectangle.set_length(10).set_width(5);
        System.out.print("the girth of Rectangle is "+rectangle.calculate_girth()+",the are of Rectangle is "+rectangle.calculate_area()+"\n");

        Triangle triangle=new Triangle();
        triangle.set_a(6).set_b(6).set_c(6);
        System.out.print("the girth of Triangle is "+triangle.calculate_girth()+",the are of Triangle is "+triangle.calculate_area()+"\n");


    }
}
