package com.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConnectToDB connector = ConnectToDB.getInstance();
        connector.connect();
    }
}
