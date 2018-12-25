/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class ManageAppointmentController implements Initializable {

    @FXML
    private JFXButton btnMakeAppointment;
    @FXML
    private JFXButton btnFilter;
    @FXML
    private JFXButton btnViewDetails;
    @FXML
    private TableColumn<?, ?> colFirstName;
    @FXML
    private TableColumn<?, ?> colLastName;
    @FXML
    private TableColumn<?, ?> colSpeciality;
    @FXML
    private TableColumn<?, ?> colHospital;
    @FXML
    private TableColumn<?, ?> colContact;
    @FXML
    private TableColumn<?, ?> colAddress;
    @FXML
    private TableColumn<?, ?> colGender;
    @FXML
    private TableColumn<?, ?> colNextAppointmentDate;
    @FXML
    private TableColumn<?, ?> colScheduleTime;
    @FXML
    private TableView<?> tblDoctor;
    @FXML
    private TableColumn<?, ?> colDocId;
    @FXML
    private TableColumn<?, ?> colNIC;
    @FXML
    private TableColumn<?, ?> colPatientCount;
    @FXML
    private TableColumn<?, ?> colFee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loadMakeAppointment(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/MakeAppointment.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void filterDoctor(ActionEvent event) {
    }

    @FXML
    private void viewDoctorDetails(ActionEvent event) {
    }

}
