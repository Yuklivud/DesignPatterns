package com.patterns.creational.builder;

public class MySQLConnectBuilder extends ConnectorBuilder{
    @Override
    void buildAddress() {
        connector.setUrl("jdbc:mysql://localhost:3306/mydb");
    }

    @Override
    void buildName() {
        connector.setUsername("mysql_root");
    }

    @Override
    void buildPass() {
        connector.setPassword("mysql_root");
    }
}
