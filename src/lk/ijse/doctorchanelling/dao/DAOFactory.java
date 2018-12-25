/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.dao;

import lk.ijse.doctorchanelling.dao.custom.impl.AppointmentDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.DoctorDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.HospitalDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.InvoiceDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.LoginDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.PatientDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.RefundDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.RoomDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.ScheduleDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.SpecialityDAOImpl;
import lk.ijse.doctorchanelling.dao.custom.impl.VatDAOImpl;

/**
 *
 * @author infomatics
 */
public class DAOFactory {

    private static DAOFactory daof;

    public enum DAOTypes {
        PATIENT, DOCTOR, APPOINTMENT, INVOICE, REFUND, LOGIN, VAT, SCHEDULE, HOSPITAL, SPECIALITY, ROOM;
    ;

    }

    private DAOFactory() {
    }

    public static DAOFactory getDAOFactory() {
        if (daof == null) {
            daof = new DAOFactory();
        }
        return daof;

    }

    public SuperDAO getSuperDAO(DAOTypes types) throws Exception {
        switch (types) {
            case PATIENT:
                return new PatientDAOImpl();
            case DOCTOR:
                return new DoctorDAOImpl();
            case APPOINTMENT:
                return new AppointmentDAOImpl();
            case INVOICE:
                return new InvoiceDAOImpl();
            case REFUND:
                return new RefundDAOImpl();
            case LOGIN:
                return new LoginDAOImpl();
            case VAT:
                return new VatDAOImpl();
            case SCHEDULE:
                return new ScheduleDAOImpl();
            case HOSPITAL:
                return new HospitalDAOImpl();
            case SPECIALITY:
                return new SpecialityDAOImpl();
            case ROOM:
                return new RoomDAOImpl();
            default:
                return null;

        }

    }

}
