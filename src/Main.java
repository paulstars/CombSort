//Java Programm zum Sortieralgorithmus Comb-Sort

public class Main {

    public static void main(String[] args) {
        CombSort vortrag = new CombSort();
        int[] array = {3,14,4,6,9,12};
        vortrag.sort(array);

        System.out.println("\n Array wurde sortiert!");
        for (int j : array) System.out.print(j + " ");
        System.out.println("\n Finished!");
    }
}
