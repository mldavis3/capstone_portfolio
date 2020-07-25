
package hci.project;

import java.util.ArrayList;
/**
 * @author Michael
 */
public class Contract {
    private String name;
    private ArrayList<SubContractor> subs;
    private ArrayList<Double> hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addContractor(SubContractor s, double howManyHours){
        //Check if sub contractor is already apart of the contract
        if (subs.contains(s)){
            return; //get out of this function and ignore the add
        }
        if (howManyHours <= 0){
            return;
        }
        subs.add(s);
        hours.add(howManyHours);
    }
    
    public void removeContractor(SubContractor s){
        int index = subs.indexOf(s);
    }
    
    public void removeContractor(int index){
        subs.remove(index);
        
    }
    
    public double getHours(SubContractor s){
        int index = subs.indexOf(s);
        if(index != -1)
            return getHours(index);
        else
            return 0; //in case contractor s is not part of this contract
    }
   
    //get the hours for the subcontractor at a given index
    public double getHours(int index){
        return hours.get(index);
    }
    
    public int getContractorCount(){
        return subs.size();
    }
    
    public SubContractor getContractor(int index){
        return subs.get(index);
    }
    
    //change the hours for a given subcontractor
    public void changeHours(SubContractor s, double newHours){
        int index = subs.indexOf(s);
        if(index != -1)
            changeHours(index, newHours);
    }
    
    //change the hours for the subcontractor at position index
    public void changeHours(int index, double newHours){
        hours.set(index, newHours); //hours[index] = newHours
    }
    
    public double computeTotalCost(){
        double total = 0;
        
        for(int i = 0; i < subs.size(); i++){
            SubContractor s = subs.get(i); // get the i-th contractor
            double h = hours.get(i); //get the i-th number of hours
            
            total = total + s.getHourlyRate() * h;
        }
        
        return total;
    }
}