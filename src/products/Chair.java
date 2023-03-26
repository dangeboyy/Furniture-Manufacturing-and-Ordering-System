package products;

import Factory.IProduct;
import Factory.Warehouse;

public class Chair implements IProduct {
    private Warehouse chairWare = new Warehouse(1000000);
    private int count=0;
    public boolean isManufactured() {
        return count != 0;
    }

    public boolean isStored() {
        return chairWare.getWcount() != 0;

    }


    public boolean isSold() {
        return isStored();
    }

    public Warehouse getChairWare() {
        return chairWare;
    }

    public void setChairWare(Warehouse chairWare) {
        this.chairWare = chairWare;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
