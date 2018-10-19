package br.com.microservices.controller;

import br.com.microservices.service.BarHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bar")
public class BarController {

    @Autowired
    BarHystrixService hystrixService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String helloWorldBar() {
        System.out.println("Bar - Passei aqui");
        return "<h1 style=\"font-size: 200;\">BAR SERVICE</h1>";
    }

    @RequestMapping(path = "/{name}",method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String helloWorldBarHystrix(@PathVariable String name) {
        return hystrixService.getGreeting(name);
    }


}
