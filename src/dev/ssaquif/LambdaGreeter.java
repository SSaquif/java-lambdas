// The code in this class in intermediary code
// For understanding purposes
// It's proper Implementation are in the 
// Greeter and Person Class
// Ie we just reused the previous Greeter class without change

package dev.ssaquif;

public class LambdaGreeter {

    public static void main(String[] args) throws Exception {

        MyLambda myLambdaFunction = () -> System.out.println("Hello World");

        MyAdd add = (int a, int b) -> a + b;

    }
}

interface MyLambda {
    void foo();
}

interface MyAdd {
    int add(int x, int y);
}