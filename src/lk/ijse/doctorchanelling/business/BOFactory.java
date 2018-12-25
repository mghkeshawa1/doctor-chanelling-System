/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.doctorchanelling.business;

import lk.ijse.doctorchanelling.business.custom.impl.AppointmentBOimpl;
import lk.ijse.doctorchanelling.business.custom.impl.DoctorBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.HospitalBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.InvoiceBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.LoginBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.PatientBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.RefundBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.RoomBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.ScheduleBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.SpecialityBOImpl;
import lk.ijse.doctorchanelling.business.custom.impl.VatBOImpl;

/**
 *
 * @author infomatics
 */
public class BOFactory {

    private static BOFactory bof;

    public enum BOTypes {
        PATIENT, DOCTOR, APPOINTMENT, INVOICE, REFUND, LOGIN, VAT, SCHEDULE, HOSPITAL, SPECIALITY, ROOM;
    }

    private BOFactory() {
    }

    public static BOFactory getBOFactory() {
        if (bof == null) {
            bof = new BOFactory();
        }
        return bof;

    }

    public SuperBO getSuperBO(BOTypes types) throws Exception {
        switch (types) {
            case PATIENT:
                return new PatientBOImpl();
            case DOCTOR:
                return new DoctorBOImpl();
            case APPOINTMENT:
                return new AppointmentBOimpl();
            case INVOICE:
                return new InvoiceBOImpl();
            case REFUND:
                return new RefundBOImpl();
            case LOGIN:
                return new LoginBOImpl();
            case VAT:
                return new VatBOImpl();
            case SCHEDULE:
                return new ScheduleBOImpl();
            case HOSPITAL:
                return new HospitalBOImpl();
            case SPECIALITY:
                return new SpecialityBOImpl();
            case ROOM:
                return new RoomBOImpl();
            default:
                return null;

        }
    }
}
