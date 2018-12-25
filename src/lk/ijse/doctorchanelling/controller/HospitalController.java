/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.ijse.doctorchanelling.models.DoctorDTO;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class HospitalController implements Initializable {

    @FXML
    private JFXButton btnDelete;
    @FXML
    private JFXTextField txtHospital;
    @FXML
    private TableView<?> tblHospital;
    @FXML
    private JFXTextField txtHospitalId;
    @FXML
    private JFXButton btnHospital;
    @FXML
    private ImageView btnClose;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void deleteHospital(ActionEvent event) {
    }

    @FXML
    private void addHospital(MouseEvent event) {
    }

    @FXML
    private void addHospital(ActionEvent event) {
    }

    @FXML
    private void closeWindow(MouseEvent event) {

        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }
}
