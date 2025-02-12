package com.patterns.creational.abstract_factory.website;

import com.patterns.creational.abstract_factory.Developer;

public class JuniorDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Junior Developer write code...");
    }
}
