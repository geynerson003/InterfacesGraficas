package com.uniminuto.semana3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.Random;

public class MainController {

    @FXML
    private Button moveButton;

    @FXML
    private Pane mainPane;

    private Random random = new Random();

    @FXML
    private void handleMoveButtonClick() {

        double paneWidth = mainPane.getWidth();
        double paneHeight = mainPane.getHeight();

        double newX = random.nextDouble() * (paneWidth - moveButton.getWidth());
        double newY = random.nextDouble() * (paneHeight - moveButton.getHeight());

        moveButton.setLayoutX(newX);
        moveButton.setLayoutY(newY);

    }

    @FXML
    private TextField inputNumberField;

    @FXML
    private TextField resultField;

    @FXML
    private void handleInputNumber(){
        String inputText = inputNumberField.getText();

        try {
            double number = Double.parseDouble(inputText);

            System.out.println("Numero imgresado: " + number);
        }catch (NumberFormatException e){
            System.out.println("Por favor, ingresa un número válido");
        }

    }

    @FXML
    private void handleSqrtButtonClick(){
        String inputText = inputNumberField.getText();

        try {
            double number = Double.parseDouble(inputText);

            double result = Math.sqrt(number);

            resultField.setText(String.valueOf(result));
        }catch (NumberFormatException e){
            System.out.println("Por favor, ingrese un número válido");
        }
    }

    @FXML
    private  TextField counterField;

    private int counter = 0;

    @FXML
    private void handleCountButtonClick(){

        counter++;

        counterField.setText(String.valueOf(counter));
    }

}