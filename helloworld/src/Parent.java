public class Parent {
    private int a = 10;  // private 필드
    public int b = 20;   // public 필드
}

class Child extends Parent{
    public int c = 30;

    void display(){
        // System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class PrivateTest{
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        child.display();
    }
}
