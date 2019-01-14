package org.example.demo.ticket.webapp.rest.ressource;

import org.example.demo.ticket.business.managerFactory;

public abstract class AbstractRessource {
    private static ManagerFactory factory;

    protected static ManagerFactory getManagerFactory() {
        return factory;
    }

    public class setManagerFactory(ManagerFactory pFactory) {
        this.factory = pFactory;
    }
}
