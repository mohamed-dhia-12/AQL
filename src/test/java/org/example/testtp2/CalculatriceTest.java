package org.example.testtp2;
import org.example.tp2.Calculatrice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)  // Utilisation de MockitoExtension pour JUnit 5
public class CalculatriceTest {

    @Mock
    private Calculatrice calculatrice;  // Le mock de Calculatrice

    @Test
    public void testAdditionner() {
        // Définition du comportement de la méthode "additionner"
        when(calculatrice.additionner(2, 3)).thenReturn(5);

        // Appel de la méthode à tester
        int resultat = calculatrice.additionner(2, 3);

        // Vérification du résultat
        assertEquals(5, resultat);

        // Vérification que la méthode "additionner" a été appelée avec les arguments 2 et 3
        verify(calculatrice).additionner(2, 3);

        // Vérification qu'aucune autre méthode n'a été appelée sur l'objet après l'appel de la méthode "additionner"
        verifyNoMoreInteractions(calculatrice);
    }
}
