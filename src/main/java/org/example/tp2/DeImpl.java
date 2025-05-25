package org.example.tp2;

import java.util.Random;

public class DeImpl implements De {
    private Random random = new Random();

    @Override
    public int lancer() {
        return random.nextInt(6) + 1; // Retourne un nombre entre 1 et 6
    }
}
