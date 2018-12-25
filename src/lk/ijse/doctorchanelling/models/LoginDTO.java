/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.models;

/**
 *
 * @author infomatics
 */
public class LoginDTO {
    private String login_id;
    private String full_name;
    private String username;
    private String password;
    private String last_login_date;

    public LoginDTO() {
    }

    public LoginDTO(String login_id, String full_name, String username, String password, String last_login_date) {
        this.login_id = login_id;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.last_login_date = last_login_date;
    }

    /**
     * @return the login_id
     */
    public String getLogin_id() {
        return login_id;
    }

    /**
     * @param login_id the login_id to set
     */
    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    /**
     * @return the full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * @param full_name the full_name to set
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the last_login_date
     */
    public String getLast_login_date() {
        return last_login_date;
    }

    /**
     * @param last_login_date the last_login_date to set
     */
    public void setLast_login_date(String last_login_date) {
        this.last_login_date = last_login_date;
    }

    
}
