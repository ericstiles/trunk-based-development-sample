package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    void testGetMessage() {
        App app = new App();
        assertEquals("Hello, Trunk Based Development!", app.getMessage());
    }
}
