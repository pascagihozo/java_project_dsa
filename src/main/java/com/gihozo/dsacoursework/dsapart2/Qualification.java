
package com.gihozo.dsacoursework.dsapart2;

import com.gihozo.dsacoursework.part3.EmployeeList;

/**
 *
 * @author pascal
 */
public class Qualification extends EmployeeList{
    private String bachelors;
    private String HighSchoool;
    private String masters;
    private String phd;
    private String professor;

    public Qualification(String bachelors, String HighSchoool, String masters, String phd, String professor) {
        this.bachelors = bachelors;
        this.HighSchoool = HighSchoool;
        this.masters = masters;
        this.phd = phd;
        this.professor = professor;
    }
    public Qualification(){}
    
    public String getBachelors() {
        return bachelors;
    }

    public String getHighSchoool() {
        return HighSchoool;
    }

    public String getMasters() {
        return masters;
    }

    public String getPhd() {
        return phd;
    }

    public String getProfessor() {
        return professor;
    }

    public void setBachelors(String bachelors) {
        this.bachelors = bachelors;
    }

    public void setHighSchoool(String HighSchoool) {
        this.HighSchoool = HighSchoool;
    }

    public void setMasters(String masters) {
        this.masters = masters;
    }

    public void setPhd(String phd) {
        this.phd = phd;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Qualification{" + "bachelors=" + bachelors + ", HighSchoool=" + HighSchoool + ", masters=" + masters + ", phd=" + phd + ", professor=" + professor + '}';
    }
    
    
    
    
}
