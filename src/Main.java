import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        byte a = 100;
//        short b = 20000;
//        int c = 1000000000;
//        long d = 1000000000;
//        float e = 10.22f;
//        double f = 10.34523424324;
//        boolean g = true;
//        boolean h = false;
//        char i = 'i';
        String name = "Andrei";
        String name1 = "Andrei";
        String name2 = new String("Andrei");
        String welcome = "Hello wrld";

//        System.out.println(name == name1);
//        System.out.println(name == name2);
//        System.out.println(welcome);
        int a = 1;
        int b = 1;
        int c = a + b;
//        System.out.println(c);
        double d = (double) a / b;
//        System.out.println(d);
//        System.out.println(a % b);
//        System.out.println(++b);
//        System.out.println(a > b);


//        Person person1 = new Person();

        Person person2 = new Person("Pasha");
//        name = person2.name;

//        System.out.println(person2.getName());
//        person2.setName("Alexandr");
//        System.out.println(person2.getName());
//        person2.printNameAndSecondName("Andrei", "Verbitski");


        Scanner sc = new Scanner(System.in);
//        String newName = sc.nextLine();
//        Person person3 = new Person(newName);
//        person3.printName();

        //Ключевое слово this указывает на то что свойство относится к данному экземпляру объекта (this.name = name)
        //Ключевое слово final указывает на неизменяемую переменную (public final double PI)
        //Ключевое слово static указывает на то что переменная относится ко всему классу, а не к экземплярам
        Person person4 = new Person("Aleks");
//        System.out.println(person2.count);
//        System.out.println(person4.count);
        Dog tusic = new Dog("Bobik", 1, "grey");
        tusic.makeSound();
        Animal animal = new Animal("animal", 1);
        animal.makeSound();
        tusic.overload();
        tusic.overload("Yes");
        tusic.overload("wadwadawd", 1);
        Airplane airplane = new Airplane();
        airplane.fly();
        Butterfly butterfly = new Butterfly();
        butterfly.fly();
    }
}