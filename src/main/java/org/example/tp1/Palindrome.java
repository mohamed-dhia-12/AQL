package org.example.tp1;

/*public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j++;  // ❌ Erreur : devrait être j--
            i--;  // ❌ Erreur : devrait être i++
        }
        return true;
    }
}*/
public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", ""); // On supprime les espaces et on met tout en minuscule
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;  // Correction: i doit augmenter pour parcourir la chaîne de gauche à droite
            j--;  // Correction: j doit diminuer pour parcourir la chaîne de droite à gauche
        }
        return true;
    }
}
