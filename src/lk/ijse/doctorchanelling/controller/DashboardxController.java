/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class DashboardxController implements Initializable {

    @FXML
    private AnchorPane paneSub;
    @FXML
    private Pane paneHome;
    @FXML
    private Pane btnLogout;
    @FXML
    private Pane paneDoctor;
    @FXML
    private Pane panePatient;
    @FXML
    private Pane paneReports;
    @FXML
    private ImageView btnClose;
    @FXML
    private AnchorPane root;
    @FXML
    private Pane paneManageAppointment;
    @FXML
    private Pane paneOtherService;
    @FXML
    private Label lblTime;
    @FXML
    private Label lblDate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        setDateTime();

    }

    private void setDateTime() {
        Timeline newTimeLine = new Timeline(new KeyFrame(Duration.seconds(0), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lblDate.setText(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
                lblTime.setText(new SimpleDateFormat("hh:mm:ss a").format(new Date()));
            }

        }), new KeyFrame(Duration.seconds(1)));
        newTimeLine.setCycleCount(Animation.INDEFINITE);
        newTimeLine.play();
    }

    private void loadAppointmentForm(MouseEvent event) throws IOException {

        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Appointment.fxml"));
        paneSub.getChildren().setAll(load);

    }

    @FXML
    private void loadHome(MouseEvent event) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Home.fxml"));
        paneSub.getChildren().setAll(load);

    }

    @FXML
    private void logOut(MouseEvent event) {
    }

    @FXML
    private void loadManageDoctor(MouseEvent event) throws IOException {

        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/ManageDoctor.fxml"));
        paneSub.getChildren().setAll(load);
    }

    private void loadAddPatient(MouseEvent event) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/ManagePatients.fxml"));
        paneSub.getChildren().setAll(load);
    }

    @FXML
    private void loadReporsUi(MouseEvent event) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Reports.fxml"));
        paneSub.getChildren().setAll(load);
    }

    @FXML
    private void exit(MouseEvent event) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure ?", ButtonType.OK, ButtonType.CANCEL);
        Optional<ButtonType> showAndWait = a.showAndWait();
        if (showAndWait.get()==ButtonType.OK) {
            Platform.exit();
            System.exit(0);
        }

    }

    @FXML
    private void loadManageAppointment(MouseEvent event) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/ManageAppointment.fxml"));
        paneSub.getChildren().setAll(load);
    }

    @FXML
    private void loadManagePatient(MouseEvent event) throws IOException {
        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/ManageAllPatient.fxml"));
        paneSub.getChildren().setAll(load);
    }

    @FXML
    private void loadOtherServices(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/OtherService.fxml"));
        Stage stage = new Stage();
        Scene scenee = new Scene(root);
        stage.setScene(scenee);
        stage.show();

    }

    @FXML
    private void loadSchedule(MouseEvent event) throws IOException {

        AnchorPane load = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Schedule.fxml"));
        paneSub.getChildren().setAll(load);
    }

}
