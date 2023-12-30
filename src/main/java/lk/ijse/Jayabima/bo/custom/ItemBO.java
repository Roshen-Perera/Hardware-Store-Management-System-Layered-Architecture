package lk.ijse.Jayabima.bo.custom;

import lk.ijse.Jayabima.bo.SuperBO;
import lk.ijse.Jayabima.dao.SQLUtil;
import lk.ijse.Jayabima.dto.ItemDto;
import lk.ijse.Jayabima.dto.tm.CustomerCartTm;
import lk.ijse.Jayabima.dto.tm.StockCartTm;
import lk.ijse.Jayabima.entity.Item;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ItemBO extends SuperBO {

    ArrayList<ItemDto> getAllItem() throws SQLException;

    boolean saveItem(ItemDto dto) throws SQLException;

    boolean updateItem(ItemDto dto) throws SQLException;

    boolean existItem(String id) throws SQLException;

    boolean deleteItem(String id) throws SQLException, ClassNotFoundException;

    String generateItemID() throws SQLException;

    ItemDto searchItem(String id) throws SQLException;

}
