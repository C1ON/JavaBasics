import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        try {
//            int[] arrays = new int[]{1, 2, 3};
//            System.out.println(arrays[3]);
//        } catch (Exception exception) {
//            System.out.println("Error!!");
//        } finally {
//            System.out.println("This part always works.");
//        }

//        BufferedReader reader = null;
//
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\Caner\\Flash Dosyalar\\Java\\Java Basics\\exceptionHandling\\srcnumbers.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            reader.close();
//        }

        AccountManager manager = new AccountManager();
        System.out.println("Account: " + manager.getBalance());

        manager.deposit(100);
        System.out.println("Account: " + manager.getBalance());

        try {
            manager.withDraw(50);
        } catch (BalanceInsufficientException exception) {
            exception.printStackTrace();
        }

        System.out.println("Account: " + manager.getBalance());

        try {
            manager.withDraw(80);
        } catch (BalanceInsufficientException exception) {
            exception.printStackTrace();
        }

        System.out.println("Account: " + manager.getBalance());


    }
}