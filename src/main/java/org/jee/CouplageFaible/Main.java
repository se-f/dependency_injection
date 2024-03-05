package org.jee.CouplageFaible;

import org.jee.CouplageFaible.client.ClientA;
import org.jee.CouplageFaible.interfaces.Service;
import org.jee.CouplageFaible.service.ServiceB;
import org.jee.CouplageFaible.service.ServiceC;

public class Main {
    public static void main(String[] args) {

        // Instanciation du service à travers son interface
        Service service = new ServiceB();

        ClientA client = new ClientA(service);
        client.doSomething();

        client.setService(new ServiceC());
        client.doSomething();
    }
}