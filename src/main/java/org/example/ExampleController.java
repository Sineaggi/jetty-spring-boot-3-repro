package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping
    public ExampleRecord example() {
        return new ExampleRecord("example", 42);
    }
}
