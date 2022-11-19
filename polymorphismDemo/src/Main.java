public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//
//        for (BaseLogger logger : loggers) {
//            logger.Log("Log Mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
        customerManager1.add();

        CustomerManager customerManager2 = new CustomerManager(new EmailLogger());
        customerManager2.add();

    }
}