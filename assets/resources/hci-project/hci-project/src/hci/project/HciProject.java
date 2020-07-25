/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci.project;

public class HciProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       SubContractor a,b,c,d,e,f;//Creates 3 new SubContractors
        
        //Set the values for SubContractor a
        a = new SubContractor();
        a.setCompany("ABC Electric");
        a.setHourlyRate(75);
        a.setSpecialty("Electrician");
        
        //Set the values for SubContractor b
        b = new SubContractor();
        b.setCompany("DEF Plumbing");
        b.setHourlyRate(60);
        b.setSpecialty("Plumbing");
        
        //Set the values for SubContractor c
        c = new SubContractor();
        c.setCompany("GHI Telecom");
        c.setHourlyRate(80);
        c.setSpecialty("Telecommunications");
        
         //Set the values for SubContractor d
        d = new SubContractor();
        d.setCompany("JKL Electric");
        d.setHourlyRate(75);
        d.setSpecialty("Electrician");
        
        //Set the values for SubContractor e
        e = new SubContractor();
        e.setCompany("MNO Plumbing");
        e.setHourlyRate(60);
        e.setSpecialty("Plumbing");
        
        //Set the values for SubContractor f
        f = new SubContractor();
        f.setCompany("PQR Telecom");
        f.setHourlyRate(80);
        f.setSpecialty("Telecommunications");
        
        //Create two new contract
        Contract g,h;
        
        //Contract g contains Subcontractor a,b,c
        g = new Contract();
        g.setName("Contract STU");
        g.addContractor(a, 15);
        g.addContractor(b, 20);
        g.addContractor(c, 10);
        
        //Contract h contains Subcontractor d,e,f
        h = new Contract();
        h.setName("Contract VWX");
        h.addContractor(d, 30);
        h.addContractor(e, 25);
        h.addContractor(f, 15);
        
        //printing contract information
        System.out.println("Contract " + g.getName() + " has a total of cost of $" +
                g.computeTotalCost() + " and the following subs:");
        //need a loop to go through all contractors
        for(int i = 0; i < g.getContractorCount(); i++){
            SubContractor s = g.getContractor(i); //get the i-th sub
            System.out.println("\t" + " (" + s.getSpecialty() + ")" +
                    " for " + g.getHours(i) + " hours at $" + s.getHourlyRate());
        }
        
        //printing contract information
        System.out.println("Contract " + h.getName() + " has a total of cost of $" +
                h.computeTotalCost() + " and the following subs:");
        //need a loop to go through all contractors
        for(int i = 0; i < g.getContractorCount(); i++){
            SubContractor s = h.getContractor(i); //get the i-th sub
            System.out.println("\t" + " (" + s.getSpecialty() + ")" +
                    " for " + g.getHours(i) + " hours at $" + s.getHourlyRate());
        
        }
        
        //Change the hours
        for (int i = 0; i < g.getContractorCount(); i++){
            SubContractor s = g.getContractor(i);
            g.changeHours(i, 40);
        }
        
        for (int i = 0; i < h.getContractorCount(); i++){
            SubContractor s = h.getContractor(i);
            g.changeHours(i, 60);
        }
        
        
        //Print new information
        //Contract g
         for(int i = 0; i < g.getContractorCount(); i++){
            SubContractor s = g.getContractor(i); //get the i-th sub
            System.out.println("\t" + " (" + s.getSpecialty() + ")" +
                    " for " + g.getHours(i) + " hours at $" + s.getHourlyRate());
        }
         
         //Contract h
         for(int i = 0; i < g.getContractorCount(); i++){
            SubContractor s = h.getContractor(i); //get the i-th sub
            System.out.println("\t" + " (" + s.getSpecialty() + ")" +
                    " for " + g.getHours(i) + " hours at $" + s.getHourlyRate());
        
        }
      }   
    }
    

