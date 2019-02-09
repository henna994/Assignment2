/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henna
 */
public class BeerSong {
    public static void Ninety_Nine_Bottles_of_Beer()
   {
        for(int i = 99; i>=1; i--){
            int less = i -1;
            if (i == 1){
               System.out.println(i +" bottle of beer on the wall," +i+ " bottle of beer take one down, "
                   + "\npass it around, no more bottles of beer on the wall.");
            }
               else {
                    System.out.println(i +" bottles of beer on the wall," +i+ " bottles of beer take one down, "
                   + "\npass it around," + less + " bottles of beer on the wall.");
                       
            }
   }
   }
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
           }
}
    
    

