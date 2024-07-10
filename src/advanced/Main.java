package advanced;

public class Main {
    public static void main(String[] args) {
        Box<Integer> boxInteger = new Box<>();
        Box<String> boxString = new Box<>();

        boxInteger.setT(123);
        boxString.setT("Test");

        System.out.println(boxString.getT());
        System.out.println(boxInteger.getT());
    }
}

class Box<T> {
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    private T t;
}