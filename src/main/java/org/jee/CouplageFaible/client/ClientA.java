package org.jee.CouplageFaible.client;

import org.jee.CouplageFaible.interfaces.Client;
import org.jee.CouplageFaible.interfaces.Service;

public class ClientA implements Client {
    // Le client maintenant interagit avec l'interface Service et non pas l'implémentation de la classe service
    // S'il y a un changement dans l'implémentation du service, le client n'est pas besoin d'être modifié
    Service service;

    public ClientA(Service service) {
        this.service = service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void doSomething() {
        String info = service.getInfo();
        System.out.println(info);
    }
}
