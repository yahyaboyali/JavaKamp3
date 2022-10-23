package Polimorfizm.logger;

public class DataBaseLogger extends BaseLogger{
    public void log(String message) {
        System.out.println(message+ " db'ye loglandı");
    }
}
