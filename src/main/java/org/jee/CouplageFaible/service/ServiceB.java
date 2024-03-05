package org.jee.CouplageFaible.service;

import org.jee.CouplageFaible.interfaces.Service;

public class ServiceB implements Service {

    @Override
    public String getInfo() {
        return "ServiceB’s Info";
    }
}