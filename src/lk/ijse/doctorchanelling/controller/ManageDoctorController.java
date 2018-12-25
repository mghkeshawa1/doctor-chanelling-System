/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.stage.Stage;
import lk.ijse.doctorchanelling.business.BOFactory;
import lk.ijse.doctorchanelling.business.custom.DoctorBO;
import lk.ijse.doctorchanelling.business.custom.SpecialityBO;
import lk.ijse.doctorchanelling.models.DoctorDTO;
import lk.ijse.doctorchanelling.models.SpecialityDTO;
import lk.ijse.doctorchanelling.resources.IDGenerator;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class ManageDoctorController implements Initializable {

    @FXML
    private JFXTextField txtDocId;
    @FXML
    private JFXTextField txtFirstName;
    @FXML
    private JFXTextField txtLastName;
    @FXML
    private JFXTextField txtNIC;
    private JFXTextField txtGender;
    @FXML
    private JFXTextField txtContact;
    @FXML
    private JFXTextField txtAddress;
    private JFXTextField txtScheduleTime;
    private JFXTextField txtFee;
    @FXML
    private JFXComboBox<String> cmbHospital;
    ObservableList<String> listHospital;
    @FXML
    private TableView<DoctorDTO> tblDoctor;
    @FXML
    private JFXButton btnDeleteDoctor;
    @FXML
    private JFXButton btnUpdateDoctor;
    @FXML
    private JFXComboBox<String> cmbSpeciality;
    ObservableList<String> listSpeciality;
    @FXML
    private JFXTextField txtFeeForAppointment;
    @FXML
    private RadioButton radioMale;
    @FXML
    private RadioButton radioFemale;
    @FXML
    private JFXButton btnClearAll;
    private JFXTextField txtNextAppointmentDate;
    @FXML
    private ToggleGroup Gender;
    private DoctorBO docBo;
    @FXML
    private TableColumn<DoctorDTO, String> colDocId;
    @FXML
    private TableColumn<DoctorDTO, String> colFirstName;
    @FXML
    private TableColumn<DoctorDTO, String> colLastName;
    @FXML
    private TableColumn<DoctorDTO, String> colSpeciality;
    @FXML
    private TableColumn<DoctorDTO, String> colContact;
    @FXML
    private TableColumn<DoctorDTO, String> colNIC;
    @FXML
    private TableColumn<DoctorDTO, String> colAddress;
    @FXML
    private TableColumn<DoctorDTO, String> colGender;
    @FXML
    private JFXTextField txtFilter;
    @FXML
    private JFXButton btnFilterDoctor;
    private DatePicker dtpNextAppointmentDate;

    Date next_appoinment_date;
    Time schedule_time;
    @FXML
    private TableColumn<DoctorDTO, String> colHospital;
    @FXML
    private TableColumn<DoctorDTO, String> colPatientCount;
    @FXML
    private TableColumn<DoctorDTO, String> colFee;
    @FXML
    private JFXComboBox<String> cmbPatientCount;
    ObservableList<String> numberOfPatient;
    @FXML
    private JFXButton btnInsertDoctor;
    private final DoctorBO doctorBO;
    private ObservableList<DoctorDTO> tblData = FXCollections.observableArrayList();
    @FXML
    private ImageView btnSpecialityPopUp;
    @FXML
    private ImageView btnHospitalPopUp;
    private SpecialityBO specialityBO;

    public ManageDoctorController() throws Exception {
        this.doctorBO = (DoctorBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.DOCTOR);
        specialityBO = (SpecialityBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.SPECIALITY);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        listSpeciality = FXCollections.observableArrayList("Allergists/Immunologists", "Cardiologists", "Orthopedic Surgery", "Urology");
//        cmbSpeciality.setItems(listSpeciality);
        listHospital = FXCollections.observableArrayList("Matara Base Hospital", "Kamburupitiya General Hospital", "Mahamodhara Hospital", "Karapitiya Hospital");
        cmbHospital.setItems(listHospital);
        numberOfPatient = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6");
        cmbPatientCount.setItems(numberOfPatient);

        radioMale.setUserData("male");
        radioFemale.setUserData("female");

        try {
            loadDataFromDatabase();
            loadTableColumn();
            setDoctor();

        } catch (Exception ex) {

        }

        loadSpecilityName();

    }

    @FXML
    private void InsertDoctor(ActionEvent event) throws Exception {

        DoctorBO superBO = (DoctorBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.DOCTOR);

        String doc_id = txtDocId.getText();
        String first_name = txtFirstName.getText();
        String last_name = txtLastName.getText();
        String speciality = (String) cmbSpeciality.getSelectionModel().getSelectedItem();
        String hospital = (String) cmbHospital.getSelectionModel().getSelectedItem();
        String contact = txtContact.getText();
        String nic = txtNIC.getText();
        String address = txtAddress.getText();
        String gender;
        if (radioMale.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }

        String patient_per_hour = (String) cmbPatientCount.getSelectionModel().getSelectedItem();
        double fee_for_appointment = Double.parseDouble(txtFeeForAppointment.getText());

        DoctorDTO doc = new DoctorDTO(
                doc_id,
                first_name,
                last_name,
                speciality,
                hospital,
                contact,
                nic,
                address,
                gender,
                patient_per_hour,
                fee_for_appointment
        );
        loadTableColumn();
        docBo = (DoctorBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.DOCTOR);
        boolean result = docBo.addDoctor(doc);

        if (result) {
            setDoctor();
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Doctor Added Success", ButtonType.OK);
            a.show();
        }
        loadDataFromDatabase();
        loadTableColumn();

    }

    @FXML
    private void deleteDoctor(ActionEvent event) throws Exception {
        String doc_id = tblDoctor.getSelectionModel().getSelectedItem().getDoc_id();

        loadDataFromDatabase();
        loadTableColumn();
    }

    @FXML
    private void updateDoctor(ActionEvent event) {

    }

    @FXML
    private void loadAgain(ActionEvent event) throws Exception {

        loadDataFromDatabase();
        loadTableColumn();

    }

    @FXML
    private void filterDoctor(ActionEvent event) {
    }

    @FXML
    private void clearDoctorDetails(ActionEvent event) {

        txtFirstName.clear();
        txtLastName.clear();
        txtAddress.clear();
        txtFeeForAppointment.clear();
        txtNIC.clear();
        txtContact.clear();
        cmbPatientCount.getSelectionModel().clearSelection();
        cmbSpeciality.getSelectionModel().clearSelection();
        cmbHospital.getSelectionModel().clearSelection();
        radioFemale.setSelected(false);
        radioMale.setSelected(false);

//        set the validation for this for empty clear
    }

    private void loadTableColumn() {

        colDocId.setCellValueFactory(new PropertyValueFactory<>("doc_id"));
        colFirstName.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        colLastName.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        colSpeciality.setCellValueFactory(new PropertyValueFactory<>("speciality"));
        colHospital.setCellValueFactory(new PropertyValueFactory<>("hospital"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colGender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        colPatientCount.setCellValueFactory(new PropertyValueFactory<>("patient_per_hour"));
        colFee.setCellValueFactory(new PropertyValueFactory<>("fee_for_appointment"));

    }

    public void loadDataFromDatabase() throws Exception {
        docBo = (DoctorBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.DOCTOR);
        ArrayList<DoctorDTO> doctorDTO = docBo.getAllDoctors();
        tblDoctor.setItems(FXCollections.observableArrayList(doctorDTO));

    }

    @FXML
    private void loadToTextField(TouchEvent event) {
    }

    @FXML
    private void getDetails(MouseEvent event) {
        DoctorDTO doctorDTO = tblDoctor.getSelectionModel().getSelectedItem();
        txtDocId.setText(doctorDTO.getDoc_id());
        cmbHospital.setValue(doctorDTO.getHospital());
        if (doctorDTO.getGender().equalsIgnoreCase("male")) {
            radioMale.setSelected(true);
        } else {
            radioFemale.setSelected(true);
        }

    }

    @FXML
    private void loadPopUpSpeciality(MouseEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Speciality.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void loadPopUpHospital(MouseEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Hospital.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void setDoctor() throws IOException {
        try {
            String doctor;
            doctor = IDGenerator.getNewID("doctor", " doc_id", "Doc");
            txtDocId.setText(doctor);
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }

    private void loadSpecilityName() {
        try {
            ArrayList<SpecialityDTO> specialityDTOs = specialityBO.getAllSpecialities();
            ArrayList<String> id = new ArrayList<>();
            for (SpecialityDTO spe : specialityDTOs) {
                id.add(spe.getSpecility());

            }
            for (String string : id) {
                cmbSpeciality.getItems().add(string);

            }
        } catch (Exception ex) {
            Logger.getLogger(ManageDoctorController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
