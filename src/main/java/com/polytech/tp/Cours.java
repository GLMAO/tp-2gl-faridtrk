package com.polytech.tp;

/**
 * Classe concrète représentant un cours. 
 * Elle est la base pour le pattern Builder (construction) et le Composant Concret 
 * pour le pattern Decorator (méthode getDescription).
 */
public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    private String jour;
    private String heure;
    private boolean optionnel;
    private String niveau;
    private boolean materiel;

    // Constructeur "énorme" avec 8 arguments, nécessaire pour que le test Decorator compile
    public Cours(String matiere, String enseignant, String salle, String jour, 
                 String heure, boolean optionnel, String niveau, boolean materiel) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.jour = jour;
        this.heure = heure;
        this.optionnel = optionnel;
        this.niveau = niveau;
        this.materiel = materiel;
    }

    // Getters requis par le test Builder (Exercice 1)
    public String getMatiere() {
        return matiere;
    }

    public String getEnseignant() {
        return enseignant;
    }

    // Implémentation de l'interface ICours (Exercice 3)
    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + 
               " (" + niveau + ", " + jour + " à " + heure + ")";
    }
}