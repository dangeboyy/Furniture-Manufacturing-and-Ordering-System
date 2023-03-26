package products;

import Factory.IProduct;
import Factory.Warehouse;

public class Dresser implements IProduct {
    private  Warehouse dresserWare = new Warehouse(1000000);
    private int count=0;
    public boolean isManufactured() {
        return count != 0;
    }

    public boolean isStored() {
        return dresserWare.getWcount() != 0;
    }


    public boolean isSold() {
        return isStored();
    }

    public Warehouse getDresserWare() {
        return dresserWare;
    }

    public void setDresserWare(Warehouse dresserWare) {
        this.dresserWare = dresserWare;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
