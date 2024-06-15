package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.view.tdm.CustomerTM;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CustomerDAO {


    public List<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public void saveData(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void deletedata(String id) throws SQLException, ClassNotFoundException ;

    public String currentID() throws SQLException, ClassNotFoundException;

    public boolean getexistID(String id) throws SQLException, ClassNotFoundException ;

    public String getCName(String newValue) throws SQLException, ClassNotFoundException;
}
