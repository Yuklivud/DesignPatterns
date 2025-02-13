package com.patterns.creational.singleton;

    public class ConnectToDB {
        private static final ConnectToDB INSTANCE = new ConnectToDB();

        private ConnectToDB() {}

        public static ConnectToDB getInstance() {
            return INSTANCE;
        }

        public void connect() {
            System.out.println("Connecting to DB...");
        }
    }
