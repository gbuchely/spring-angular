package com.gbuchely.demo.server.util;

import org.junit.Ignore;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("automation")
class UtilAutomationTest {

    @Test
    void getComposedStringSuccesful() {
        assertEquals(2, 1 + 1);
    }

}