/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.ijse.doctorchanelling.business.BOFactory;
import lk.ijse.doctorchanelling.business.custom.PatientBO;
import lk.ijse.doctorchanelling.models.PatientDTO;
import lk.ijse.doctorchanelling.resources.IDGenerator;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class ManageAllPatientController implements Initializable {

    @FXML
    private JFXTextField txtPatientId;
    @FXML
    private JFXTextField txtFName;
    @FXML
    private JFXTextField txtLName;
    @FXML
    private JFXTextField txtPatientNIC;
    @FXML
    private JFXTextField txtPatientContact;
    @FXML
    private JFXTextField txtPatientDisease;
    @FXML
    private RadioButton radioMale;
    @FXML
    private ToggleGroup Gender;
    @FXML
    private RadioButton radioFemale;
    @FXML
    private JFXButton btnInsertPatient;
    @FXML
    private JFXButton btnDeletePatient;
    @FXML
    private JFXButton btnUpdatePatient;
    @FXML
    private JFXButton btnCleatAllPatient;
    @FXML
    private TableView<PatientDTO> tblPatient;
    @FXML
    private TableColumn<PatientDTO, String> colPatientId;
    @FXML
    private TableColumn<PatientDTO, String> colPatientFirstName;
    @FXML
    private TableColumn<PatientDTO, String> colPatientLastName;
    @FXML
    private TableColumn<PatientDTO, String> colPatientNIC;
    @FXML
    private TableColumn<PatientDTO, String> colPatientGender;
    @FXML
    private TableColumn<PatientDTO, String> colPatientContact;
    @FXML
    private TableColumn<PatientDTO, String> colPatientDisease;
    @FXML
    private JFXTextField txtPatientFilter;
    @FXML
    private JFXButton btnFilterPatient;
    private PatientBO patientBO;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            loadDataFromDatabase();
            loadTableColumn();
        } catch (Exception ex) {
            Logger.getLogger(ManageAllPatientController.class.getName()).log(Level.SEVERE, null, ex);
        }
        setPatientID();

    }

    @FXML
    private void insertPatient(MouseEvent event) throws Exception {

        PatientBO superBO = (PatientBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.PATIENT);

        String pid = txtPatientId.getText();
        String first_name = txtFName.getText();
        String last_name = txtLName.getText();
        String nic = txtPatientNIC.getText();

        String gender;
        if (radioMale.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }
        String contact = txtPatientContact.getText();
        String disease = txtPatientDisease.getText();

        PatientDTO patient = new PatientDTO(pid, first_name, last_name, nic, gender, contact, disease);

        PatientBO patientBO = (PatientBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.PATIENT);
        boolean result = patientBO.addPatient(patient);
        loadDataFromDatabase();
        loadTableColumn();
    }

    @FXML
    private void deletePatient(MouseEvent event) {

    }

    @FXML
    private void updatePatient(MouseEvent event) {

    }

    @FXML
    private void clearAllPatient(MouseEvent event) {

        txtPatientId.clear();
        txtFName.clear();
        txtLName.clear();
        txtPatientNIC.clear();
        radioFemale.setSelected(false);
        radioMale.setSelected(false);
        txtPatientContact.clear();
        txtPatientDisease.clear();

    }

    @FXML
    private void filterPatient(ActionEvent event) {

    }

    private void loadTableColumn() {

        colPatientId.setCellValueFactory(new PropertyValueFactory<>("pid"));
        colPatientFirstName.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        colPatientLastName.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        colPatientNIC.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colPatientGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colPatientContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colPatientDisease.setCellValueFactory(new PropertyValueFactory<>("disease"));

    }

    public void loadDataFromDatabase() throws Exception {
        patientBO = (PatientBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.PATIENT);
        ArrayList<PatientDTO> patientDTO = patientBO.getAllPatients();
        tblPatient.setItems(FXCollections.observableArrayList(patientDTO));

    }

    public void setPatientID() {

        try {
            String patient;
            patient = IDGenerator.getNewID("patient", " pid", "P");
            txtPatientId.setText(patient);
        } catch (SQLException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(ManageAllPatientController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
