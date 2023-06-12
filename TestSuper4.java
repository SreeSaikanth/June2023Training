class Animal
{
Animal(){System.out.println("animal is create");}
}
class Dog extends Animal
{
Dog(){

System.out.println("dog is created");
}
}
class TestSuper4
{
public static void main(String args[])
{
Dog d=new Dog();
}
} 