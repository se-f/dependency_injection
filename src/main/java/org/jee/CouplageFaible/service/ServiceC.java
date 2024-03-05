package org.jee.CouplageFaible.service;

import org.jee.CouplageFaible.interfaces.Service;

public class ServiceC implements Service {

    @Override
    public String getInfo() {
        return "ServiceC's Info";
    }
}