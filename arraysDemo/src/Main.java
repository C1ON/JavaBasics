public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Ayşe";
        ogrenciler[2] = "Mehmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("*****************************************");

        for (String ogrenci : ogrenciler) {
            System.out.println("Öğrenci: " + ogrenci);
        }

    }
}