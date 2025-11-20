package com.polytech.tp;

/**
 * Décorateur Concret (Pattern Decorator).
 * Ajoute la caractéristique "En ligne" à la description du cours.
 */
public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours coursDecore) {
        super(coursDecore);
    }

    @Override
    public String getDescription() {
        // On récupère la description de base et on y ajoute notre spécificité
        return super.getDescription() + " (En ligne)";
    }
}