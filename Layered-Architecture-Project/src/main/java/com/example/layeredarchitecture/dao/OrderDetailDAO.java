package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface OrderDetailDAO {
    boolean saveorderDetail(List<OrderDetailDTO> orderDetails, String orderId, Connection connection) throws SQLException, ClassNotFoundException;
}
