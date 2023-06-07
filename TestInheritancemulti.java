class Animal1
{
void eat(){System.out.println("eating...");}
}
class Dog extends Bnimal1{
void bark(){System.out.println("barking..");}
}
class BabyDog extends Dog
{
void weep(){System.out.println("weeping..");}
}
class TestInheritancemulti
{
public static void main(String args[])
{
BabyDog d=new BabyDog();
d.bark();
d.eat();
d.weep();
}
}