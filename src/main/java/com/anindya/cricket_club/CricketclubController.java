package com.anindya.cricket_club;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class CricketclubController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label LabelTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;
    ArrayList<Player> playerArrayList;

    @javafx.fxml.FXML
    public void initialize() {
        playerArrayList= new ArrayList<>();
    }}