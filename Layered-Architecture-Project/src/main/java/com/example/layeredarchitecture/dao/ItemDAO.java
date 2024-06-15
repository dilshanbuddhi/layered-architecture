package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO {
    public List<ItemDTO> getAllitem() throws  ClassNotFoundException, SQLException ;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;

    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public void update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

    public boolean getexistID(String code) throws SQLException, ClassNotFoundException;

    public String currentId() throws SQLException, ClassNotFoundException ;

    public ItemDTO getdetail(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean updatedata(Connection connection, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException ;
}
