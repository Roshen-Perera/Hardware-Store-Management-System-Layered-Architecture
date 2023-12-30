package lk.ijse.Jayabima.bo.custom.impl;

import lk.ijse.Jayabima.bo.custom.CustomerBO;
import lk.ijse.Jayabima.dao.DAOFactory;
import lk.ijse.Jayabima.dao.custom.CustomerDAO;
import lk.ijse.Jayabima.dto.CustomerDto;
import lk.ijse.Jayabima.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    public ArrayList<CustomerDto> getAllCustomer() throws SQLException {
        ArrayList<Customer> customers = customerDAO.getAll();
        ArrayList<CustomerDto> customerDTOS = new ArrayList<>();
        for (Customer customer:customers) {
            customerDTOS.add(new CustomerDto(customer.getId(),customer.getName(),customer.getAddress(), customer.getMobile()));
        }
        return customerDTOS;
    }

    public boolean saveCustomer(CustomerDto dto) throws SQLException {
        //customer business logic example
        return customerDAO.save(new Customer(dto.getId(),dto.getName(),dto.getAddress(), dto.getMobile()));
    }

    public boolean updateCustomer(CustomerDto dto) throws SQLException {
        return customerDAO.update(new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getMobile()));
    }

    public boolean existCustomer(String id) throws SQLException {
        return customerDAO.exist(id);
    }

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        customerDAO.delete(id);
        return true;
    }

    public String generateCustomerID() throws SQLException {
        return customerDAO.generateID();
    }

    public CustomerDto searchCustomer(String id) throws SQLException {
        Customer customer = customerDAO.search(id);
        CustomerDto customerDto = new CustomerDto(customer.getId(),customer.getName(),customer.getAddress(), customer.getMobile());
        return customerDto;
    }
}
