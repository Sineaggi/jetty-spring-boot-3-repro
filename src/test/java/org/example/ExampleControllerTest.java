package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class ExampleControllerTest {
    private final int port;
    public ExampleControllerTest(@LocalServerPort int port) {
        this.port = port;
    }

    @Test
    public void test() {
        assertNotEquals(0, port);
    }
}
