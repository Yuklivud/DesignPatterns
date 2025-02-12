package com.patterns.creational.abstract_factory.website;

import com.patterns.creational.abstract_factory.ProjectManager;

public class JuniorPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage some project...");
    }
}
