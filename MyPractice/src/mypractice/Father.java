/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypractice;

/**
 *
 * @author kalav_000
 */
public class Father extends FamilyMember {
    private final String action;
    
    //Constructors
    Father(){
    super();
    action = "none";
    }
    
    /**
     *
     * @param n
     * @param g
     * @param a
     * @param ac
     */
    public Father(String n, String g, int a, String ac){
    super(n, g, a);
    
    action = ac;
            }
    
    public String showAction() {
        String fatherAction = getName() + " needs to be " + action + " often.";
    return fatherAction;
    } 
    
    
}
