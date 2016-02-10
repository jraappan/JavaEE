package com.base.models;
// Generated Feb 10, 2016 12:48:59 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private Integer id;
     private String CName;
     private Float grade;
     private String CInfo;
     private Set relTables = new HashSet(0);

    public Course() {
    }

	
    public Course(String CName) {
        this.CName = CName;
    }
    public Course(String CName, Float grade, String CInfo, Set relTables) {
       this.CName = CName;
       this.grade = grade;
       this.CInfo = CInfo;
       this.relTables = relTables;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCName() {
        return this.CName;
    }
    
    public void setCName(String CName) {
        this.CName = CName;
    }
    public Float getGrade() {
        return this.grade;
    }
    
    public void setGrade(Float grade) {
        this.grade = grade;
    }
    public String getCInfo() {
        return this.CInfo;
    }
    
    public void setCInfo(String CInfo) {
        this.CInfo = CInfo;
    }
    public Set getRelTables() {
        return this.relTables;
    }
    
    public void setRelTables(Set relTables) {
        this.relTables = relTables;
    }




}


