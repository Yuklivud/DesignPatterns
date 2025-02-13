package com.patterns.creational.builder;

public class ConnectorManager {
    ConnectorBuilder builder;

    public void setBuilder(ConnectorBuilder builder) {
        this.builder = builder;
    }

    ConnectToDB buildConnector() {
        builder.createConnector();
        builder.buildAddress();
        builder.buildName();
        builder.buildPass();


        return builder.getConnector();
    }
}
