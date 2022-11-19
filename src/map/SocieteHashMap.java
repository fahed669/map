/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author maato
 */
public class SocieteHashMap implements InterfaceSociete {

     HashMap<Employee,Departement> ed = new HashMap<Employee,Departement>();
     
    @Override
    public void ajouterEmployeDepartement(Employee e, Departement d) {
       
        ed.put(e,d);
        
    }

    @Override
    public void supprimerEmploye(Employee e) {
      ed.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
       for (Map.Entry<Employee,Departement> e : ed.entrySet()){
           System.out.println(e.getKey()+"-"+e.getValue());
        
           
       }
    }

    @Override
    public void afficherLesEmployes() {
        System.out.println(ed.keySet());
    }

    @Override
    public void afficherLesDepartements() {
       System.out.println(ed.values());
    }

    @Override
    public void afficherDepartement(Employee e) {
      System.out.println(ed.get(e));
    }

    @Override
    public boolean rechercherEmploye(Employee e) {
         if (ed.containsKey(e)){
            return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement e) {
        if (ed.containsValue(e)){
            return true;
        }
        return false;
    }

    void afficherDepartement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

    