public class Point{
double x;
double y;
public void setx(double_x_value) {x=x_value;}
public void sety(double_y_value) {y=y_value;}
public double getX()  {return x;}
public double getY()  {return y;}
public double Square_distance_from_origin()
{return x*x+y*y;}
public static void main(String args[]){
point p;
p=new point();
p.setx(3);
p.sety(5);
System.out.println(p.Square_distance_from_origin());
}
}
