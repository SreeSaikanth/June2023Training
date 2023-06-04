class Rectangle{
int length;
int width;
void insert(int l,int w)
{
length=l;
width=w;

}
void calculateArea(){System.out.println(length*width);}
}
public class TestRectangle1{
public static void main(String args[]){
Rectangle r1=new Rectangle(),r2=new Rectangle();//creating two objects
r1.insert(11,3);
r2.insert(10,5);
r1.calculateArea();
r2.calculateArea();
}
}
