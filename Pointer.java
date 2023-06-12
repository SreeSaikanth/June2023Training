 class Point
{
double x;
double y;
public  void setX(double x_value){x=x_value;}
public  void setY(double y_value){y=y_value;}
public  double getX() {return x;}
public  double getY() {return y;}
public double square_distance_from_origin()
{return x*x+y*y;}
}
class Pointer
{
public static void main(String args[])
{
Point p=new Point();
p.setX(5);
p.setY(7);
System.out.println(p.square_distance_from_origin());
}
}
