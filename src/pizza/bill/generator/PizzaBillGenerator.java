/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizza.bill.generator;
import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class PizzaBillGenerator {

    public static void main(String[] args) {
        
        System.out.println(" Welcome to Little Italy Pizza");
        
        //for loop out wise :> multiple pizzas
        
        System.out.println("Enter the type of pizza");
        
        Scanner sc = new Scanner(System.in);
        
        String pizzavariant = sc.nextLine();
        
        System.out.println("Veg or Non-Veg");
        
        String pizzatype = sc.nextLine();
        
        boolean isVeg;
        
        if(pizzatype == "Veg") 
            isVeg = true;
        else
            isVeg = false;
        
        System.out.println("Regular or Large Pizza ?");
        String pizzaSize = sc.nextLine();
        
        // Actual creation of pizza
        
        Pizza pizza = new Pizza(isVeg,pizzaSize);
        
        // add extra cheese
        System.out.println("Would you like to add some extra Cheese Enter : Y/N");
        String ans;
        ans = sc.nextLine();
        if(ans.equals("Y")){
            pizza.addExtraCheese();
        }
        
        // add extra toppings
        System.out.println("Would you like to add some extra Toppings Enter : Y/N");
        ans = sc.nextLine();
        if(ans.equals("Y")){
            pizza.addExtraToppings();
        }
        
        // add extra carrybags
        
        System.out.println("Would you like to add some extra CarryBag Enter : Y/N");
        ans = sc.nextLine();
        if(ans.equals("Y")){
            pizza.addCarrybag();
        }
        
        pizza.printbill();
        
        
        
        
        
        
    }
    
}
