package com.meyerds.github.intellij_gradle_jacoco.project_a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainA {
    private static final Logger LOG = LoggerFactory.getLogger(MainA.class);

    private boolean keepQuiet;

    public static void main(String[] args) {
        LOG.debug("Hello Project A");
    }

}
