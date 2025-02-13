package com.patterns.creational.builder;

public class MongoConnectorBuilder extends ConnectorBuilder {

    @Override
    void buildAddress() {
        connector.setUrl("mongodb://localhost:27017");
    }

    @Override
    void buildName() {
        connector.setUsername("mongodb_root");
    }

    @Override
    void buildPass() {
        connector.setPassword("mongodb_root");
    }
}
