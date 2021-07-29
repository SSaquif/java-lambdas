package dev.ssaquif;

public class FrenchGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Bonjour");
    }
}
