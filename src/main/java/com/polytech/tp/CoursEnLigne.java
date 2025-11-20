package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // Ajoute le suffixe "(En ligne)" à la description existante
        return coursDecorated.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // La durée reste la même que celle du cours de base
        return coursDecorated.getDuree();
    }
}
