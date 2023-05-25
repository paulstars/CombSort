//Java Programm zum Sortieralgorithmus Comb-Sort

public class Main {

    public static void main(String[] args) {
        CombSort vortrag = new CombSort();
        int[] array = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        vortrag.sort(array);

        System.out.println("\n Array wurde sortiert!");
        for (int j : array) System.out.print(j + " ");
        System.out.println("\n Finished!");
    }
}
