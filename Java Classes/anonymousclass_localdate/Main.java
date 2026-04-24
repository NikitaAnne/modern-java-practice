package anonymousclass_localdate;

import java.time.LocalDate;

interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {

        //Anonymous class - ends with semicolon
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class");
            }
        };
        greeting.sayHello();
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
    }
}
