package products;

import Factory.IProduct;
import Factory.Warehouse;


public class Bed implements IProduct {
    private Warehouse bedWare = new Warehouse(1000000);
    private int count=0;

    public void setBedWare(Warehouse bedWare) {
        this.bedWare = bedWare;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isManufactured() {
        return count != 0;
    }

    public boolean isStored() {
        return bedWare.getWcount() != 0;

    }

    public boolean isSold() {
        return isStored();
    }

    public Warehouse getBedWare() {
        return bedWare;
    }

    public int getCount() {
        return count;
    }
}
