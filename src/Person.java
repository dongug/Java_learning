public class Person {

    private String name;
    public static int count = 0;
    //конструктор по умолчанию:
//    public Person() {
//    }
    //конструктор не по умолчанию. Если при нем убрать конструктор который в 5-6 строке, то
    // нельзя будет создать объект без свойств
    public Person(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public - доступ отовсюду
//    private - доступ только внутри текущего класса
//    default - доступ внутри текущего пакета
//    protected - доступ из наследников

//    public void printNameAndSecondName(String name, String secondName) {
//        System.out.println("Имя: " + name);
//        System.out.println("Фамилия: " + secondName);
//    }
    public void printName() {
        System.out.println("Имя: " + name);
    }
}