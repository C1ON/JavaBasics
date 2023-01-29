import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("Book", "Kitap");
        dict.put("Desk", "Sıra");
        dict.put("Table", "Masa");
        dict.put("Pencil", "Kalem");

        System.out.println(dict);
    }
}