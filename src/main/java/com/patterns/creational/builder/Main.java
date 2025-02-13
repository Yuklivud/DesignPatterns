package com.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        ConnectorManager manager = new ConnectorManager();

        manager.setBuilder(new MongoConnectorBuilder());
        ConnectToDB connector = manager.buildConnector();

        System.out.println(connector);
    }
}
