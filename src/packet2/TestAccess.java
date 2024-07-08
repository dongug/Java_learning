package packet2;

public class TestAccess {
    public static void main(String[] args) {
        AccessLevels obj = new AccessLevels();
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        // доступ к приватным переменным только внутри класса
//        System.out.println(obj.privateVar);

    }
}
