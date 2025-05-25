package org.example.tp2;

public interface Joueur {
    public int mise(); // Retourne la mise du joueur
    public void debiter(int somme) throws DebitImpossibleException; // Débite la somme du joueur
    public void crediter(int somme); // Crédite la somme au joueur
}
