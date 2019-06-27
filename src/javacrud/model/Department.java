/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.model;

/**
 *
 * @author tharindi
 */
public class Department {
    private String depId;
    private String depName;
    
    public Department(){
    
    }
    
    public Department(String depId,String depName){
        this.depId=depId;
        this.depName=depName;
    }

    /**
     * @return the depId
     */
    public String getDepId() {
        return depId;
    }

    /**
     * @param depId the depId to set
     */
    public void setDepId(String depId) {
        this.depId = depId;
    }

    /**
     * @return the depName
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName the depName to set
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }
    
}
