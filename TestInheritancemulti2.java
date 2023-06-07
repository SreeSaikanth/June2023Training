class Animal2
{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal2{
void bark(){System.out.println("barking..");}
}
class Cat extends Animal2
{
void meow(){System.out.println("meowing..");}
}
class TestInheritancemulti2
{
public static void main(String args[])
{
Cat d=new Cat();
d.eat();
d.meow();
Dog c=new Dog();
c.eat();
c.bark();
}
}