package Interviews;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

abstract class FirstTest {
    abstract void method();
    void testMethod(){

    }

    public static void main(String[] args) {
        final int a =10;
        FirstTest f = new FirstTest() {
            @Override
            void method() {

            }
        };
try {
    FileReader reader = new FileReader("file.txt");
}
catch(IOException fe){

}
        // FileNotFoundException
    }
}
