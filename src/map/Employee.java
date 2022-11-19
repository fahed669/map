/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author maato
 */
public class Employee implements Comparable<Employee> {
    private int cin;
    private String matri;
    private String nom,prenom;
    
    Employee(){
        
    }
    
    Employee(int cin, String matri,String nom,String prenom){
        this.cin=cin;
        this.matri=matri;
        this.nom=nom;
        this.prenom=prenom;
    }
    
    public int getCin(){
        return this.cin;
    }
    
    public String getMatricule(){
        return this.matri;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setCin(int cin){
        this.cin=cin;
    }
    public void setMatricule(String mat){
        this.matri=mat;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    
    @Override
    public String toString(){
        
        return "La cin :"+this.cin+ ", La matricule est:"+this.matri+ ", Le nom est:"+this.nom+ ", Le prenom est:"+this.prenom;
               
    }
    
    @Override
    public boolean equals(Object obj){
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        if (obj == null){
            return false;
        }
        
        Employee e = (Employee)obj;
        return (this.getCin()==e.getCin());
    }
    
    @Override 
    public int hashCode(){
        return 30;
    }

    public int compareTo(Employee o) {
        return this.cin-o.cin;
    }

    
    
    
}
