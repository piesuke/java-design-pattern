package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class IDCard extends Product{
    private String owner;
    private int serial;

    IDCard(String owner, int serial){
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います");
    }

    public void setNumber(Integer number){
        this.serial = number;
    }

    @Override
    public String toString(){
        return "[IDCard:" + owner + "]" + "[number:" + serial + "]";
    }

    public String getOwner(){
        return owner;
    }

    public int getSerial(){
        return serial;
    }
    
}
