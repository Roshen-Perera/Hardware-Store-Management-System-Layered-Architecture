package lk.ijse.Jayabima.dao;

import lk.ijse.Jayabima.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getDaoFactory(){
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes{
        REGISTER, LOGIN,CUSTOMER, SUPPLIER, ITEM, EMPLOYEE, SALARY, STOCK_ORDER, STOCK_ORDER_DETAIL, CUSTOMER_ORDER, CUSTOMER_ORDER_DETAIL
    }

    public SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case REGISTER:
                return new RegisterDAOImpl();
            case LOGIN:
                return new LoginDAOImpl();
            case CUSTOMER:
                return new CustomerDAOImpl();
            case SUPPLIER:
                return new SupplierDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case EMPLOYEE:
                return new EmployeeDAOImpl();
            case SALARY:
                return new SalaryDAOImpl();
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
