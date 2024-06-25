package com.anindya.cricket_club;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class CricketclubController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private Label LabelTextfield;
    ArrayList<Player> playerArrayList;
    @javafx.fxml.FXML
    private ComboBox playertypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        playerArrayList= new ArrayList<>();

        playerArrayList.add(new Batsman(name "rafig" ));
    }}