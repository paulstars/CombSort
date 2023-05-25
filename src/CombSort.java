public class CombSort {
    /**
     * Berechnet gap für den nächsten Durchlauf.
     *
     * @param gap (int) Die Lücke zwischen zwei verglichenen Werten.
     * @return gap (int)
     */
    int getNextGap(int gap) {
        // Verringert gap mit Division von 1,3.
        gap = (gap * 10) / 13;

        // Gibt den Wert 1 zurück, wenn gap zuvor auf unter 1 verringert wurde.
        if (gap < 1) return 1;
        return gap;
    }

    /**
     * Sortiert das übergebene Array mit der Comb-sort-Methode.
     *
     * @param array Enthält eine unsortierte Menge an Integer
     */
    void sort(int[] array) {
        int n = array.length;

        // Initialisiert gap.
        // Die Lücke zwischen zwei verglichenen Werten.
        int gap = n;

        // Initialisiert swapped, als true um den Loop zu starten.
        // Boolean, der angibt, ob in einem Durchlauf bereits Werte getauscht wurden.
        boolean swapped = true;

        // Wiederholt sich, solang gap nicht 1 ist und ein Wert getauscht wurde.
        while (gap != 1 || swapped) {

            // Finde die nächste gap
            gap = getNextGap(gap);

            // Setze swapped auf false, da noch keine Werte vertauscht wurden.
            swapped = false;

            // Vergleiche alle Elemente mit gap
            for (int i = 0; i < n - gap; i++) {
                if (array[i] > array[i + gap]) {

                    // Wenn array[i] größer ist als array[i+gap], dann vertausche diese!
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    // Werte wurden vertauscht, daher wird swapped = true.
                    swapped = true;
                }
            }
        }
    }
}
