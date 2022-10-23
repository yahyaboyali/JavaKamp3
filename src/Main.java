import Polimorfizm.logger.BaseLogger;
import Polimorfizm.logger.DataBaseLogger;
import Polimorfizm.logger.EmailLogger;
import Polimorfizm.logger.FileLogger;

public class Main {
    public static void main(String[] args) {

        System.out.println("Polimorfizm");
        OgretmenKredi ok = new OgretmenKredi();
        KrediUi ku = new KrediUi();
        ku.krediHesapla(ok);
        BaseLogger[] loggers = new BaseLogger[]
                {
                        new FileLogger(),
                        new EmailLogger()
                        ,new DataBaseLogger()
                };
        for (BaseLogger logger:loggers) {
            logger.log("log mesajı");
        }

    }
}