package Interviews;

public class ConstructorTest {
    ConstructorTest(){
        this("Test");
        System.out.println("Run");
        String s = newTest();
        System.out.println(s);

    }

    ConstructorTest(String test){
        System.out.println("Run Test");
    }

    public static String newTest(){
        return "Something";
    }

    public static void main(String[] args) {
        ConstructorTest p = new ConstructorTest();
        ConstructorTest p1 = new ConstructorTest();
        p = null;
        int a =10;
        System.gc();
    }
}
