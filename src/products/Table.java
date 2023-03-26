package products;

import Factory.IProduct;
import Factory.Warehouse;

public class Table implements IProduct {
    private Warehouse tableWare = new Warehouse(1000000);
    private int count=0;
    public boolean isManufactured() {
        return count != 0;
    }

    public boolean isStored() {
        return tableWare.getWcount() != 0;
    }

    public boolean isSold() {
        return isStored();
    }

    public Warehouse getTableWare() {
        return tableWare;
    }

    public void setTableWare(Warehouse tableWare) {
        this.tableWare = tableWare;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
