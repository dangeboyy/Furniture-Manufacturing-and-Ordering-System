package products;

import Factory.IProduct;
import Factory.Warehouse;

public class Sofa implements IProduct {
    private Warehouse sofaWare = new Warehouse(10000000);
    private int count=0;
    public boolean isManufactured() {
        return count != 0;
    }

    public boolean isStored() {
        return sofaWare.getWcount() != 0;
    }
    public boolean isSold() {
        return isStored();
    }

    public Warehouse getSofaWare() {
        return sofaWare;
    }

    public void setSofaWare(Warehouse sofaWare) {
        this.sofaWare = sofaWare;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
