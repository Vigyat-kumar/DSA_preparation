package OOPS;
//POLLYMORPHISM ALLOWS A SINGLE ACTION(METHOD OR OBJECT) TO BEHAVE DIFFRENTLY DEPENDING ON SITUATION.
public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhaw bhaw");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("mew mew");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hii");
        }
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        Human me=new Human();

        d.speak();
        c.speak();
        me.speak();
    }
}
