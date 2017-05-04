package com.meyerds.github.intellij_gradle_jacoco.project_b;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MainBTest {

    MainB mainB;

    @Before
    public void setup() {
        mainB = new MainB();
    }

    @Test
    public void testUppercaseDefault() {
        assertEquals("i'm lower", mainB.uppercase("I'm Lower"));
    }

    @Test
    public void testUppercaseUpper() {
        mainB.setUpper(true);
        assertEquals("I'M UPPER", mainB.uppercase("I'm Upper"));
    }

    @Test
    public void testUppercaseLower() {
        mainB.setUpper(false);
        assertEquals("i'm lower", mainB.uppercase("I'm Lower"));
    }

    @Test
    public void testNoMock() {
        assertEquals("default", mainB.getProp());
    }

    @Ignore
    @Test
    public void testMock() {
        ServiceB mockedService = mock(ServiceB.class);
        mainB.setService(mockedService);

        when(mockedService.getProp()).thenReturn("not default");

        assertEquals("not default", mainB.getProp());
    }

}