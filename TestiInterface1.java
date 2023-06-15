interface Drawable
{
void draw();
}
class Rectangle implements Drawable
{
public void draw()
{System.out.println("drawing rectangle");}
}
class Circle implements Drawable
{
public void draw()
{System.out.println("drawing circle");}
}
class TestiInterface1
{
public static void main(String args[])
{
Drawable d=new Circle();
Drawable c=new Rectangle();
d.draw();
c.draw();
}
}