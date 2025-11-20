package com.polytech.tp;

/**
 * Classe abstraite Decorator (Pattern Decorator).
 * Elle implémente ICours et contient une référence à l'objet ICours décoré.
 */
public abstract class CoursDecorator implements ICours {
    protected ICours coursDecore;

    public CoursDecorator(ICours coursDecore) {
        this.coursDecore = coursDecore;
    }

    // Délègue la méthode de base au composant décoré
    @Override
    public String getDescription() {
        return coursDecore.getDescription();
    }
}