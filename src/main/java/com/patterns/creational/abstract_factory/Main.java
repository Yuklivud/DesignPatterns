package com.patterns.creational.abstract_factory;

import com.patterns.creational.abstract_factory.website.WebsiteFactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteFactory();

        Developer developer = factory.createDeveloper();
        Tester tester = factory.createTester();
        ProjectManager manager = factory.createProjectManager();

        developer.writeCode();
        tester.testFeatures();
        manager.manageProject();
    }
}
