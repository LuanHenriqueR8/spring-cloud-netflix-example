package br.com.microservices.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BarHystrixService {

    @HystrixCommand(fallbackMethod = "defaultGreeting")
    public String getGreeting(String username) {
        return new RestTemplate()
                .getForObject("http://localhost:9000/foo-service/foo/{username}",
                        String.class, username);
    }

    private String defaultGreeting(String username) {
        return "<h1 style=\"font-size: 200;\">Hello User!</h1>";
    }
}
