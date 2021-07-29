package dev.ssaquif;

public class Person {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        EnglishGreeting englishGreeting = new EnglishGreeting();
        FrenchGreeting frenchGreeting = new FrenchGreeting();
        p1.greet(englishGreeting); // Good Morning
        p1.greet(frenchGreeting); // Bonjour

        Greeting lambdaGreeting = () -> System.out.println("Hello");
        lambdaGreeting.perform(); // Hello

        p1.greet(lambdaGreeting); // Hello

    }
}
