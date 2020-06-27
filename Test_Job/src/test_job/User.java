/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_job;

/**
 *
 * @author user-win7
 */
class User {
        private long id;
        private Vacancy vacancy;
        
        
        User(long id, String prof){
            this.id = id;
            this.vacancy = new Vacancy(prof);
        }
        
        String getVacancy() {
            return vacancy.getVacancy();
        }
        
        long getId() {
            return id;
        }
    }
