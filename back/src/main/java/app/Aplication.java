package app;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Aplication {
    @Scheduled(fixedDelay = 100000)
    public void say(){
        System.out.println("Say Hello");
    }
}
