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
public class Breed1 extends Dog {
    private final String dogBreed;
    
    public Breed1(String n, String g, int a, int w, String b) {
        super(n, g, a, w);
        
        dogBreed = b;
    }
    String getDogBreed(){ return dogBreed;}
    
    /**
     *
     * @return 
     */
    public String showBreed() {
        String breed = getName() + " is a " + dogBreed + ".";
        return breed;
    }
}
