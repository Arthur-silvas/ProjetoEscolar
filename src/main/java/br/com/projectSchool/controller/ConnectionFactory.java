package br.com.projectSchool.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionFactory {

    private static final EntityManagerFactory emf;

    static{
        try{
            emf = Persistence.createEntityManagerFactory("projectSchoolPU");
        }catch (Throwable ex){
            System.err.println("Falha ao inicializar o EntityManagerFactory" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void close(){
        if(emf != null && emf.isOpen()){
            emf.close();
        }

    }
}
