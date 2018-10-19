package br.com.microservices.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String helloWorldFoo() {
        System.out.println("Foo - Passei aqui");
        return "<h1 style=\"font-size: 200;\">FOO SERVICE</h1>";
    }

    @RequestMapping(path = "/{name}",method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String helloWorldFoo(@PathVariable String name) {
        return "<h1 style=\"font-size: 200;\">Hello "+name + "!</h1>";
    }
}
