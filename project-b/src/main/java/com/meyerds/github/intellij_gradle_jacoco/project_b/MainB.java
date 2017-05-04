package com.meyerds.github.intellij_gradle_jacoco.project_b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainB {
    private static final Logger LOG = LoggerFactory.getLogger(MainB.class);

    private ServiceB service = new ServiceB("default");

    private boolean upper = false;

    public static void main(String[] args) {
        LOG.debug("Hello Project B");
    }

    public String uppercase(String input) {
        return upper ? input.toUpperCase() : input.toLowerCase();
    }

    public String getProp() {
        return service.getProp();
    }

    public void setService(ServiceB service) {
        this.service = service;
    }

    public void setUpper(boolean upper) {
        this.upper = upper;
    }
}
