//package com.nejat.webapplication2.service;
//
//import com.nejat.webapplication2.dao.PersonnelDao;
//import com.nejat.webapplication2.dao.VacationDao;
//import com.nejat.webapplication2.entity.Personnel;
//import com.nejat.webapplication2.entity.Vacation;
//
//import java.util.Date;
//import java.util.List;
//
//public class VacationService {
//
//    private VacationDao vacationDao = new VacationDao();
//    private PersonnelDao personnelDao = new PersonnelDao();
//
//    public boolean addVacation(Vacation v) {
//        try {
//
//            vacationDao.insertVacationById(v);
//            return true;
//        } catch (Exception e) {
//
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    public List<Vacation> showVacations(String ncCode) {
//        return vacationDao.findVacationsByPersonnel(ncCode);
//
//    }
//
//    public void updateVacation(Long idNextLineOp6, Date oldDateParseOp6, Date newDateParseOp6) {
//        Personnel p = personnelDao.findPersonnelById(idNextLineOp6);
//        List<Vacation> vacation = vacationDao.findVacationsByPersonnel(p.getNationalCode());
//        for (Vacation v : vacation) {
//            if (v.getDate().equals(oldDateParseOp6)) {
//                vacationDao.updateVacationById(buildVacation(v, p, newDateParseOp6));
//            }
//        }
//
//    }
//
//    public Vacation buildVacation(Vacation vacation, Personnel p, Date vacatioDate) {
//        System.out.println("Before Updation");
//        System.out.println("Vacation id = " + vacation.getId());
//        System.out.println("Vacation date = " + vacation.getDate());
//        vacation.setPersonnel(p);
//        vacation.setDate(vacatioDate);
//        System.out.println("After Updation");
//        System.out.println("Vacation id = " + vacation.getId());
//        System.out.println("Vacation date = " + vacation.getDate());
//        return vacation;
//
//    }
//
//    public void deleteVacation(Long id, Date s) {
//        vacationDao.deleteVacationById(id, s);
//
//    }
//
//}
