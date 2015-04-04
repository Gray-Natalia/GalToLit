/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypractice;

/**
 *
 * @author kalavic
 */
public class Daughter extends FamilyMember {
    private final String talents;
    
    //Constructors
    Daughter(){
        super();
        talents = "none";
    }

    /**
     *
     * @param n
     * @param g
     * @param a
     * @param t
     */
    public Daughter(String n, String g, int a, String t){
    super(n, g, a);
    
    talents = t;
            }
    
    Daughter(Daughter ob){
        super(ob);
        talents = ob.talents;
    }
    
    public String showTalents() {
        String showTalents = getName() + " knows how to " + talents + ".";
        return showTalents;
    } 
}
