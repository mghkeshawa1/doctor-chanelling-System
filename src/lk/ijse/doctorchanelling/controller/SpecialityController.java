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
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.ijse.doctorchanelling.business.BOFactory;
import lk.ijse.doctorchanelling.business.custom.SpecialityBO;
import lk.ijse.doctorchanelling.models.SpecialityDTO;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class SpecialityController implements Initializable {

    @FXML
    private JFXTextField txtSpeciality;
    @FXML
    private JFXTextField txtSpecialityId;
    @FXML
    private ImageView btnClose;
    @FXML
    private TableView<?> tblSpeciality;
    @FXML
    private JFXButton btnSpeciality;
    private SpecialityBO specialityBO;
    @FXML
    private TableColumn<?, ?> colSpe;
    @FXML
    private TableColumn<?, ?> colSpeciality;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//
//        try {
//            loadFromDataBase();
//            loadColumn();
//        } catch (Exception ex) {
//            Logger.getLogger(SpecialityController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }

    public SpecialityController() throws Exception {
        specialityBO = (SpecialityBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.SPECIALITY);
    }

    @FXML
    private void closeWindow(MouseEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void deleteSpeciality(ActionEvent event) {

        String id = txtSpecialityId.getText();

    }

    @FXML
    private void addSpeciality(ActionEvent event) throws Exception {
        String id = txtSpecialityId.getText();
        String name = txtSpeciality.getText();
        SpecialityDTO specialityDTO = new SpecialityDTO(id, name);
        boolean isAdded = specialityBO.addSpeciality(specialityDTO);
        if (isAdded) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Info Added Success", ButtonType.OK);
            a.show();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "Info Added Faild", ButtonType.OK);
            a.show();
        }

    }

//    public void loadFromDataBase() throws Exception {
//        specialityBO = (SpecialityBO) BOFactory.getBOFactory().getSuperBO(BOFactory.BOTypes.SPECIALITY);
//        ArrayList<SpecialityDTO> specialityDTO = specialityBO.getAllSpecialities();
//        tblSpeciality.setItems(FXCollections.observableArrayList(specialityDTO));
//
//    }
//
//    public void loadColumn() {
//        colSpe.setCellValueFactory(new PropertyValueFactory<>("spe_id"));
//        colSpeciality.setCellValueFactory(new PropertyValueFactory<>("specility"));

    }


