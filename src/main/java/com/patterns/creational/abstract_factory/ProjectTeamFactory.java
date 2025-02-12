package com.patterns.creational.abstract_factory;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    ProjectManager createProjectManager();
}
