package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class loginPageController {
    @FXML
    protected Button login;
    @FXML
    protected TextField userName;
    @FXML
    protected PasswordField password;


    @FXML
    protected Label createAnAccount;
    @FXML
    protected Label firstTimeRunning;

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://LocalHost:3306";

    static String USER = null;

    static String PASS = null;
    Connection conn;
    Statement stmt;

    @FXML
    protected void logInButtonClick(){
        USER = userName.getText();
        PASS = password.getText();
    }

    @FXML
    protected void createAnAccountButtonClick() throws IOException {
        Stage window = (Stage) createAnAccount.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(ilovepizzaApplication.class.getResource("registerCustomer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),640,400);
        window.setScene(scene);
    }

    @FXML
    protected void firstTimeRunning() throws IOException {
        Stage window = (Stage) firstTimeRunning.getScene().getWindow();
        Scene scene = new Scene(new FXMLLoader(ilovepizzaApplication.class.getResource("hostConnector.fxml")).load());
        window.setScene(scene);
    }




}