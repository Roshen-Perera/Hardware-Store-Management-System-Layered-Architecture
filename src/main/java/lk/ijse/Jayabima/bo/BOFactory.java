package lk.ijse.Jayabima.bo;

import lk.ijse.Jayabima.bo.custom.impl.CustomerBOImpl;
import lk.ijse.Jayabima.bo.custom.impl.ItemBOImpl;
import lk.ijse.Jayabima.bo.custom.impl.SupplierBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;

    }
    public enum BOTypes{
        CUSTOMER, SUPPLIER, ITEM, EMPLOYEE, STOCK_ORDER, PLACE_ORDER
    }
    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:
                return new CustomerBOImpl();
            case SUPPLIER:
                return new SupplierBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case EMPLOYEE:
                return null;
            case STOCK_ORDER:
                return null;
            case PLACE_ORDER:
                return null;
            default:
                return null;
        }
    }
}
