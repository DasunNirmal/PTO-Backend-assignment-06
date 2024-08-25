package lk.ijse.ptobackend.bo;

import lk.ijse.ptobackend.bo.custom.impl.CustomerBOImpl;
import lk.ijse.ptobackend.bo.custom.impl.ItemBOImpl;

public class BOFactory {

    private static BOFactory boFactory;
    private BOFactory() {}

    public static BOFactory getBoFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes {
        CUSTOMERS,ITEMS,ORDERS
    }

    public SuperBO getBO(BOTypes boType) {
        switch (boType) {
            case CUSTOMERS:
                return new CustomerBOImpl();
            case ITEMS:
                return new ItemBOImpl();
                default: return null;
        }
    }
}
