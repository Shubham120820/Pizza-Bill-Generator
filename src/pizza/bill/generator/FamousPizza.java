/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.bill.generator;


public class FamousPizza extends Pizza {
    
    public FamousPizza(boolean isVeg, String Size) {
        super(isVeg, Size);
        addExtraToppings();
    }
    
}
