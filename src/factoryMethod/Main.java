package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.create("Sato");
        Product idCard2 = factory.create("Eisaku");
        idCard1.use();
        idCard2.use();
    }
}
