/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class OtherServiceController implements Initializable {

    @FXML
    private JFXButton btnAddSpeciality;
    @FXML
    private JFXTextField txtSpeciality;
    @FXML
    private JFXTextField txtHospital;
    @FXML
    private JFXTextField txtSpecialityId;
    @FXML
    private JFXTextField txtHospitalId;
    @FXML
    private JFXButton btnRefund;
    @FXML
    private JFXButton btnHospital;
    @FXML
    private JFXButton btnVat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addSpeciality(MouseEvent event) {
    }

    @FXML
    private void loadRefund(ActionEvent event) {
    }

    @FXML
    private void addHospital(MouseEvent event) {
        
        
    }

    @FXML
    private void loadVat(ActionEvent event) {
    }
    
}
