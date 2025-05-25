package org.example.tp2;

public class Jeu {
    private Banque banque;
    private boolean estOuvert;

    public Jeu(Banque banque) {
        this.banque = banque;
        this.estOuvert = true;
    }

    public void jouer(Joueur joueur, De de1, De de2) throws JeuFermeException {
        if (!estOuvert) {
            throw new JeuFermeException("Le jeu est fermé");
        }

        int mise = joueur.mise();
        try {
            joueur.debiter(mise);
        } catch (DebitImpossibleException e) {
            // Si le joueur est insolvable, arrêter le jeu
            return;
        }

        // Lancer les dés
        int sommeDes = de1.lancer() + de2.lancer();

        // Si la somme n'est pas 7, le joueur perd
        if (sommeDes != 7) {
            return;
        }

        // Le joueur gagne
        int gain = mise * 2;
        joueur.crediter(gain);

        // Vérification de la solvabilité de la banque
        if (!banque.est_solvable()) {
            fermer(); // Si la banque devient insolvable, fermer le jeu
        }
    }

    public void fermer() {
        estOuvert = false;
    }

    public boolean estOuvert() {
        return estOuvert;
    }
}
