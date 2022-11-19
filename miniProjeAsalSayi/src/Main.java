public class Main {
    public static void main(String[] args) {
        int number = 29;

        for (int i = 2; i<number; i++){
            if(number % i == 0){
                System.out.println("The number is not primitive.");
                break;
            }
            else{
                System.out.println("The number is primitive.");
                break;
            }
        }

    }
}