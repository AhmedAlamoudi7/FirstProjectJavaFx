/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

/**
 *
 * @author Ahmed_DEv
 */
public class mainApp {
    public static void main(String[] args) {
        
        Double name[] = {21.3,121.2,12.2,1.2};
        show(name);
        
  
        Persons []person ={
          new Person(12,"asad",23),
          new Doctor(12,"ahmed",2)
        
        };        
                show(person);

        
    }
    
        
        public static <T> void show(T data[]){
          
            for (T a :data) {
            System.out.println(a);
            }
   
        }
    
}
