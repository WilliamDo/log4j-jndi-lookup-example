package com.ultimaspin.log4j;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServer {
    interface RemoteService extends Remote { /* nothing */ }
    static class RemoteServiceImpl implements RemoteService { /* nothing */ }

    public static void main(String[] args) {
        try {
            var serviceImpl = new RemoteServiceImpl();
            var serviceStub = (RemoteService) UnicastRemoteObject.exportObject(serviceImpl, 0);
            var registry = LocateRegistry.createRegistry(9999);
            registry.rebind("service", serviceStub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
