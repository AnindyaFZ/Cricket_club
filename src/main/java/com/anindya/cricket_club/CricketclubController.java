package com.anindya.cricket_club;

import javafx.event.ActionEvent;
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
    ArrayList<Batsman> batArrayList;
    ArrayList<Bowler>  bowlArrayList;
    @javafx.fxml.FXML
    private ComboBox<String> playertypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        playertypeComboBox.getItems().addAll("Batsman", "Bowler");
        batArrayList= new ArrayList<>();
        bowlArrayList=new ArrayList<>();

        batArrayList.add(new Batsman("Sabab","1-01-2001","1-1-2020",21,"Batsman","40/20","120","200","1234" ));
        bowlArrayList.add(new Bowler( "Neon","22-07-1999", "10-1-2020", 23,"Bowler","7.30","39","7/15","4321"));
//why we created different array list?
    }

    @javafx.fxml.FXML
    public void loginOnAction(ActionEvent actionEvent) {
        String name, pass,pType;
        name=nameTextField.getText();
        pass=passwordTextField.getText();
        pType=playertypeComboBox.getValue();
         if (pType=="Batsman"){

             for (Batsman bat:batArrayList){
                 LabelTextfield.setText(bat.toString());

            }

        } else if (pType=="Bowler") {
             for (Bowler bowl:bowlArrayList){
                 LabelTextfield.setText(bowl.toString());
             }

         }


    }
}