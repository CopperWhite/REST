package rip;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "%s";
    private final AtomicLong counter = new AtomicLong();
    private String glas = "eyuioaEYUIOA";
    private String incomeArray[];
    public char char1;
    public char char2;
    private String result = "";
    private String result2 = "";

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="request", required=false, defaultValue="World") String request) {

    	for (int i = 0; i<=request.length() - 1; i++) {
    		int k = 0;
    		while (k <= 11) {
    			char1 = request.charAt(i);
    			char2 = glas.charAt(k);
    			if (char1 == char2) {
    				result = result + char1;
    				break;
    			} else {
    				k++;
    			}
    		};
        };

        return new Greeting(counter.incrementAndGet(),
            String.format(template, "Гласные: " + result)
        );
    }
}