package lk.ijse.Jayabima.dao;

import lk.ijse.Jayabima.dao.custom.impl.CustomerDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getDaoFactory(){
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes{
        CUSTOMER, SUPPLIER, ITEM, EMPLOYEE, STOCK_ORDER, STOCK_ORDER_DETAIL, CUSTOMER_ORDER, CUSTOMER_ORDER_DETAIL
    }

    public SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case SUPPLIER:
                return null;
            case ITEM:
                return null;
            case EMPLOYEE:
                return null;
            case STOCK_ORDER:
                return null;
            case STOCK_ORDER_DETAIL:
                return null;
            case CUSTOMER_ORDER:
                return null;
            case CUSTOMER_ORDER_DETAIL:
                return null;
            default:
                return null;
        }
    }
}
