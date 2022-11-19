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
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee(25365689,"2A23","khouini","yacin");
        Employee e2 = new Employee(55985645,"3A23","majd","tepsi");
        Employee e3 = new Employee(45867465,"3A23","fasko","fasko");
        
        Departement d1 = new Departement(1,"IA");
        Departement d2 = new Departement(2,"DS");
        Departement d3 = new Departement(3,"Bu");
        
        SocieteHashMap s = new SocieteHashMap();
        
        s.ajouterEmployeeDepartement(e1, d1);
        s.ajouterEmployeeDepartement(e2, d2);
        s.ajouterEmployeeDepartement(e3, d3);
        System.out.println("************************");
                
                
       
        s.afficherDepartement();
        System.out.println("************************");
        s.afficherLesEmployes();
        System.out.println("************************");
        s.afficherLesEmployesLeursDepartements();
                
        
        
       // SocieteMap t = new SocieteTreeMap();
       // t.ajouterEmployeDepartement(e3, d3);
       // t.ajouterEmployeDepartement(e1, d1);
        //t.ajouterEmployeDepartement(e2, d2);
       // System.out.println("************LES EMPLOYES TREE MAP************");
        //t.afficherLesEmployes();
    }
    
}
    
    

