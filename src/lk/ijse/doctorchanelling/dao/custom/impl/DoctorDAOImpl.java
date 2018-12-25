/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.dao.custom.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import lk.ijse.doctorchanelling.dao.CrudUtil;
import lk.ijse.doctorchanelling.dao.custom.DoctorDAO;
import lk.ijse.doctorchanelling.entity.Doctor;

/**
 *
 * @author infomatics
 */
public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public boolean add(Doctor entity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Doctor VALUES (?,?,?,?,?,?,?,?,?,?,?)", entity.getDoc_id_PK(), entity.getFirst_name(), entity.getLast_name(), entity.getSpeciality(), entity.getHospital(), entity.getContact(), entity.getNic(), entity.getAddress(), entity.getGender(), entity.getPatient_per_hour(), entity.getFee_for_appointment());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Doctor WHERE doc_id=?", id);
    }

    @Override
    public boolean update(Doctor entity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Doctor SET first_name=?,last_name=?,speciality=?,hospital=?,contact=?,nic=?,address=?,gender=?, next_appoinment_date=?, schedule_time=?,patient_per_hour=?,fee_for_appoinment =? WHERE doc_id", entity.getFirst_name(), entity.getLast_name(), entity.getSpeciality(), entity.getHospital(), entity.getContact(), entity.getNic(), entity.getAddress(), entity.getGender(), entity.getPatient_per_hour(), entity.getFee_for_appointment());
    }

    @Override
    public Doctor Search(String id) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Doctor WHERE doc_id=?", id);
        if (rst.next()) {
            return new Doctor(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getDouble(11));
        }
        return null;

    }

    @Override
    public ArrayList<Doctor> getAll() throws Exception {
        ArrayList<Doctor> doctor = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Doctor ");
        while (rst.next()) {
            Doctor doc = new Doctor(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8),rst.getString(9), rst.getString(10), rst.getDouble(11));
            doctor.add(doc);
        }
        return doctor;
    }
}
