package com.patterns.creational.builder;


public abstract class ConnectorBuilder {
    ConnectToDB connector;

    void createConnector() {
        connector = new ConnectToDB();
    }

    abstract void buildAddress();
    abstract void buildName();
    abstract void buildPass();

    ConnectToDB getConnector() {
        return connector;
    }
}
