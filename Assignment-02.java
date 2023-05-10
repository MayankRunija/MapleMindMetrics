public class Main {
    public static void main(String[] args) {
        char[][] pattern = {
            {' ', ' ', ' ', ' ', '*', ' ', '#', ' ', '*', ' ', '#', ' ', '*'},
            {' ', ' ', ' ', '$', ' ', '%', ' ', '%', ' ', '$', ' ', ' ', ' '},
            {' ', ' ', '*', ' ', '#', ' ', '*', ' ', '#', ' ', '*', ' ', ' '},
            {' ', '$', ' ', '%', ' ', '%', ' ', ' ', '$', ' ', ' ', ' ', ' '},
            {'*', ' ', '#', ' ', '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        int n = pattern.length; // number of rows in the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
