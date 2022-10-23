package Polimorfizm.logger;

public class FileLogger extends BaseLogger{
    public void log(String message) {
        System.out.println(message+ " file'a loglandı");
    }
}
