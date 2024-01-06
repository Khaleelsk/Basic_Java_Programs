class Patterns {
    public static void main(String... args) {
        int i, j, n = 5;
        char c = 'A';
        for (i = 0; i < n; i++) {
            for (j = 1; j <= i + 1; j++) {
                System.out.print((char) c + "" + j + " ");
                c++;
            }
            System.out.println();
        }
        for (i = 4; i >= 0; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) c + "" + i + " ");
                c++;
            }
            System.out.println();
        }
    }
}
