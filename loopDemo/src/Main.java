public class Main {
    public static void main(String[] args) {
        // FOR
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }

        System.out.println("For Döngüsü Bitti.");

        // WHILE
        int i = 1;
        while (i < 10) {
            System.out.println("i:" + i);
            i++;
        }

        System.out.println("While Döngüsü Bitti.");

        //DO WHILE
        int j = 1;
        do {
            System.out.println("j:" + j);
            j += 2;
        } while (j < 10);

        System.out.println("Do While Döngüsü Bitti.");

    }
}