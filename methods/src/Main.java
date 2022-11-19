public class Main {
    public static void main(String[] args) {
        mukemmelSayiBulma();
    }

    public static void mukemmelSayiBulma() {
        int number = 8128;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (number == total) {
            mesajVer(number + " mükemmel sayıdır.");
        } else {
            mesajVer(number + " mükemmel sayı değildir.");
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);

    }

}