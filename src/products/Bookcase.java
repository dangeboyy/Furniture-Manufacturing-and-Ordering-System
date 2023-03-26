package products;

import Factory.IProduct;
import Factory.Warehouse;

public class Bookcase implements IProduct {
    private  Warehouse bookcaseWare = new Warehouse(1000000);
    private int count=0;
    public boolean isManufactured() {
        return count != 0;
    }
    public boolean isStored() {
        return bookcaseWare.getWcount() != 0;
    }

    public boolean isSold() {
        return isStored();
    }

    public Warehouse getBookcaseWare() {
        return bookcaseWare;
    }

    public void setBookcaseWare(Warehouse bookcaseWare) {
        this.bookcaseWare = bookcaseWare;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
