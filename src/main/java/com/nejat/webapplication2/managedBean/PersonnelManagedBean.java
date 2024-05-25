//package com.nejat.webapplication2.managedBean;
//
//import com.nejat.webapplication2.entity.Personnel;
//import com.nejat.webapplication2.service.PersonnelService;
//import jakarta.enterprise.context.RequestScoped;
//import jakarta.inject.Inject;
//import jakarta.inject.Named;
//
//@RequestScoped
//@Named
//public class PersonnelManagedBean {
//    private Long id;
//    private String nationalCode;
//    private String firstName;
//    private String lastName;
//    private String cityName;
//    private Personnel pf;
//    @Inject
//    private PersonnelService personnelService;
//    @Inject
//    private Personnel personnel;
//
//
//
//    public void doInsert(){
//
//        Personnel p=new Personnel(nationalCode,firstName,lastName,cityName);
//        personnelService.addPersonnel(p);
//    }
//    public Personnel doFind(Long id){
//        pf=personnelService.findPersonnel(id);
//        return pf;
//    }
//    public void doUpdate(Long id,String fn,String ln,String cn){
//        personnelService.updatePersonnel(id,fn,ln,cn);
//    }
//    public void doDelete(Long id){
//        personnelService.deletePersonnel(id);
//    }
//
//}
