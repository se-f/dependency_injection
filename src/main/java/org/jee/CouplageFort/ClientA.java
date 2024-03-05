package org.jee.CouplageFort;

public class ClientA {

    // Client utilise le serviceB directement, si on l'utilise plus il y'aura des problemes de refactoring
    // -> Couplage Fort
    ServiceB service;

    public void doSomething() {
        String info = service.getInfo();
    }
}