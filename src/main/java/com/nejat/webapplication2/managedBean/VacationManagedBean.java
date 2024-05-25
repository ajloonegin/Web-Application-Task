//package com.nejat.webapplication2.managedBean;
//
//import com.nejat.webapplication2.entity.Personnel;
//import com.nejat.webapplication2.entity.Vacation;
//import com.nejat.webapplication2.service.PersonnelService;
//import com.nejat.webapplication2.service.VacationService;
//import jakarta.enterprise.context.RequestScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//
//import java.util.Date;
//import java.util.List;
//
//@RequestScoped
//@Named
//public class VacationManagedBean {
//    @Inject
//    private PersonnelService personnelService;
//    @Inject
//    private VacationService vacationService;
//    @Inject
//    private Vacation vacation;
//
//    private Long id;
//    private Date date;
//    private Personnel personnel=personnelService.findPersonnel(id);
//    private List<Vacation> vf;
//
//
//
//    Vacation v=new Vacation(personnel,date);
//
//    public boolean doInsert(Vacation v){
//        vacationService.addVacation(v);
//        return true;
//    }
//    public List<Vacation> doFind(){
//        vf=vacationService.showVacations(personnel.getNationalCode());
//        return vf;
//    }
//    public void doUpdate(Long id, Date oldDateParseOp6, Date date){
//        vacationService.updateVacation(id,vacation.getDate(),date);
//    }
//    public void doDelete(Long id,Date dd){
//        vacationService.deleteVacation(id,vacation.getDate());
//    }
//
//}
