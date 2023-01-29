public class BalanceInsufficientException extends Exception {

    private final String message;

    public BalanceInsufficientException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
