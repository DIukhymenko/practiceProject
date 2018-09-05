package com.java_hero;

import io.github.tatools.sunshine.core.RegexCondition;
import io.github.tatools.sunshine.core.Sun;
import io.github.tatools.sunshine.core.VerboseRegex;
import io.github.tatools.sunshine.testng.LoadableTestNGSuite;
import io.github.tatools.sunshine.testng.TestNGKernel;

public class App {
    public static void main(String[] args) {
        new Sun(new TestNGKernel(new LoadableTestNGSuite(new VerboseRegex(new RegexCondition("^com.java_hero.tests(.+)?"))))).shine();
    }
}
