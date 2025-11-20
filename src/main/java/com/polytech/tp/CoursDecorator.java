package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected ICours coursDecorated;

    public CoursDecorator(ICours cours) {
        this.coursDecorated = cours;
    }

    // On force les classes concrètes à implémenter ces méthodes
    @Override
    public abstract String getDescription();

    @Override
    public abstract double getDuree();
}
