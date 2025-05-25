package org.example.tp2;

public class BanqueImpl implements Banque {
    private int solde;
    private int soldeMinimum;

    public BanqueImpl(int soldeInitial, int soldeMinimum) {
        this.solde = soldeInitial;
        this.soldeMinimum = soldeMinimum;
    }

    @Override
    public void crediter(int somme) {
        solde += somme;
    }

    @Override
    public boolean est_solvable() {
        return solde >= soldeMinimum;
    }

    @Override
    public void debiter(int somme) throws DebitImpossibleException {
        if (solde < somme) {
            throw new DebitImpossibleException("Solde insuffisant");
        }
        solde -= somme;
    }
}
