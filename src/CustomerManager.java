import Polimorfizm.logger.BaseLogger;

public class CustomerManager {
    private BaseLogger logger;// anne ile çalışıyoruz
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add() {
        System.out.println("müşteri eklendi");
        //new yapmak sıkıntı körü körüne bağımlılığı azaltmalıyız
        this.logger.log("log mesajı");
    }
}
