package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    int i = 0;
    @Override
    public String toString() {
        return "I am Dog: " + i++;
    }
}
