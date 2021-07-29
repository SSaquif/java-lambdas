package dev.ssaquif;

public class EnglishGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Good Morning");
    }

}
