//package com.nejat.webapplication2.dao;
//
//import com.nejat.webapplication2.entity.Vacation;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.Persistence;
//import jakarta.persistence.Query;
//
//import java.util.Date;
//import java.util.List;
//
//public class VacationDao {
//    public List<Vacation> findVacationsByPersonnel(String nationalCode) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
//        EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("findVacationsByPersonnel");
//        query.setParameter("nationalCode", nationalCode);
//
//        return query.getResultList();
//    }
//
//    public void insertVacationById(Vacation v) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//            em.persist(v);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//
//    }
//
//    public void updateVacationById(Vacation vacation) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//            em.merge(vacation);
//            em.getTransaction().commit();
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//
//    public void deleteVacationById(Long id, Date d) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
//        EntityManager em = emf.createEntityManager();
//
//        try {
//            em.getTransaction().begin();
//            Vacation v = em.find(Vacation.class, id);
//            em.remove(v);
//            em.getTransaction().commit();
//            System.out.println("removed");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//
//    }
//}
