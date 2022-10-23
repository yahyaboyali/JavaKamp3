package Polimorfizm.logger;

public class EmailLogger extends BaseLogger{
    public void log(String message) {
        System.out.println(message+ " Email'e loglandı");
    }
}
