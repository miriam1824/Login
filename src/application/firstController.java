package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

public class firstController {

    @FXML
    private Button btnLogin;

    @FXML
    private VBox containerLeft;

    @FXML
    private VBox containerRight;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUser;

    @FXML
    void eventAction(ActionEvent event) throws NumberFormatException, IOException {
    	Object evt = event.getSource();
    	
    	if(evt.equals(btnLogin)) {
    		/*Comprobamos si los campos tienen información*/ 
    		if(!txtUser.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
    			String user = txtUser.getText();
    			String password = txtPassword.getText();
    			int n=0;
    			int numPassword= password.length();
    			/* Comprobamos que la contraseña tenga 8 caracteres*/
    			if(numPassword == 8) {
    			

    			}else {
    				JOptionPane.showMessageDialog(null, "La contraseña escrita no es demasiado larga/corta", 
                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); 
    			}
    			
                 
                 
    		}else {
    			 JOptionPane.showMessageDialog(null, "Error al iniciar sesión datos de acceso incorrectos", 
                         "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); 
    		}
    	}
    }

    @FXML
    void eventKey(KeyEvent event) {
    	
    	Object evt = event.getSource();
    	
    	if(evt.equals(txtUser)) {
    		/*Si es un espacio comprobamos, no dejamos poner un espacio*/ 
    		if(event.getCharacter().equals(" ")){
    			event.consume();
    		}
    		
    	}else if(evt.equals(txtPassword)) {
    		/*Si es un espacio comprobamos*/ 
    		if(event.getCharacter().equals(" ")){
    			event.consume();
    		}
    	}
    }

}
