/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.dao.custom.PatientDAO;
import lk.ijse.doctorchanelling.entity.Patient;

/**
 *
 * @author infomatics
 */
public class PatientDAOImpl implements PatientDAO{

    @Override
    public boolean add(Patient entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Patient VALUES(?,?,?,?,?,?,?)", entity.getPid(),entity.getFirst_name(),entity.getLast_name(),entity.getNic(),entity.getGender(),entity.getContact(),entity.getDisease());
    }

    @Override
    public boolean delete(String id) throws Exception {
       return CrudUtil.executeUpdate("DELETE FROM Patient WHERE pid=?", id);
    }

    @Override
    public boolean update(Patient entity) throws Exception {
       return CrudUtil.executeUpdate("UPDATE Patient SET first_name=?,last_name=?,nic=?,gender=?,contact=?,disease =? WHERE pid", entity.getFirst_name(), entity.getLast_name(), entity.getNic(), entity.getGender(), entity.getContact(), entity.getDisease());
    }

    @Override
    public Patient Search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Patient WHERE pid=?", id);
        if (rst.next()) {
            return new Patient(rst.getString("colPatientId"), rst.getString("colPatientFirstName"), rst.getString("colPatientLastName"), rst.getString("colPatientNIC"), rst.getString("colPatientGender"), rst.getString("colPatientContact"), rst.getString("colPatientDisease"));
        }
        return null;
    }

    @Override
    public ArrayList<Patient> getAll() throws Exception {
        ArrayList<Patient> patientList = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Patient ");
        while (rst.next()) {
            Patient patient = new Patient(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7));
            patientList.add(patient);
        }
        return patientList;
    }

   
}
