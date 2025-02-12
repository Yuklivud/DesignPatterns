package com.patterns.creational.abstract_factory.website;

import com.patterns.creational.abstract_factory.Developer;
import com.patterns.creational.abstract_factory.ProjectManager;
import com.patterns.creational.abstract_factory.ProjectTeamFactory;
import com.patterns.creational.abstract_factory.Tester;

public class WebsiteFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JuniorDeveloper();
    }

    @Override
    public Tester createTester() {
        return new JuniorTester();
    }

    @Override
    public ProjectManager createProjectManager() {
        return new JuniorPM();
    }
}
