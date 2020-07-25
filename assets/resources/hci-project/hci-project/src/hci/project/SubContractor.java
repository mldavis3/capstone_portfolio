/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci.project;

    import java.util.Scanner;
/**
 *
 * @author Michael
 */
public class SubContractor {
    public String company, specialty;
    public int hourlyRate;
    
    Scanner input = new Scanner(System.in);
    
    public void setName(String newName){
        
}

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
}

