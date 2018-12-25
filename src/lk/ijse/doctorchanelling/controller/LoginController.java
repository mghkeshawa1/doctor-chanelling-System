/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.resources.PasswordUtil;

/**
 * FXML Controller class
 *
 * @author infomatics
 */
public class LoginController implements Initializable {

    @FXML
    private JFXButton btnLogin;
    @FXML
    private AnchorPane root;
    @FXML
    private JFXTextField txtUserName;
    @FXML
    private JFXPasswordField txtPassword;
    @FXML
    private JFXButton btnA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnA.setVisible(false);
    }

    @FXML
    private void loadDashboardx(ActionEvent event) throws IOException, Exception {

        ResultSet rst = CrudUtil.executeQuery("Select * from user");
        if (rst.next()) {
            String userName = rst.getString(2);
            String salt = rst.getString(3);
            String secPw = rst.getString(4);

            boolean ifPasswordMatches = PasswordUtil.verifyUserPassword(txtPassword.getText(), secPw, salt);
            if (ifPasswordMatches && txtUserName.getText().equals(userName)) {

                Parent parent = FXMLLoader.load(getClass().getResource("/lk/ijse/doctorchanelling/view/Dashboardx.fxml"));
                Scene scene = new Scene(parent);
                this.root.getChildren().clear();
                Stage stage = (Stage) this.root.getScene().getWindow();
                stage.setScene(scene);
                stage.setScene(scene);
                stage.centerOnScreen();
                stage.show();
            } else {
                Alert a = new Alert(Alert.AlertType.INFORMATION, "Error in username password combination!", ButtonType.OK);
            a.show();
               
            }
        }

    }

    @FXML
    private void addUser(MouseEvent event) {
        try {
            String userName = txtUserName.getText();
            String password = txtPassword.getText();
            String salt = PasswordUtil.getSalt(30);
            String secPw = PasswordUtil.generateSecurePassword(password, salt);
            CrudUtil.executeUpdate("Insert into user values(?,?,?,?)", "001", userName, salt, secPw);
        } catch (Exception ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
