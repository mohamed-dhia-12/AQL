package org.example.tp2;

public interface Banque {
    public void crediter(int somme); // Crédite la banque
    public boolean est_solvable(); // Vérifie si la banque est solvable
    public void debiter(int somme) throws DebitImpossibleException; // Débite la banque
}
