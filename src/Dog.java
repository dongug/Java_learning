public class Dog extends Animal{
    private String color;

    //взятие переменных конструктора из родительского класса
    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    //переопределение метода
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    //перегрузка методов - когда одно название метода может реализовываться по-разному, в зависимости
    // от входных параметров
    public void overload() {
        System.out.println("Empty");
    }

    public void overload(String name) {
        System.out.println("Name: " + name);
    }

    public void overload(String s, int a) {
        System.out.println(s);
        System.out.println(a);
    }
}
