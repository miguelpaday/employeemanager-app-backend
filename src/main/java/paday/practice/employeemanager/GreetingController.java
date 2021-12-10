package paday.practice.employeemanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import paday.practice.employeemanager.model.Greeting;

import java.time.temporal.Temporal;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final static String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    private Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
