/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza.bill.generator;

/**
 *
 * @author Shubham
 */
public class Pizza {
    private int BasePrice;
    private boolean isVeg;
    private int ToppingsPrice;
    private int CheesePrice;
    private int TotalAmount;
    private int CarrybagPrice;
    private String Size;
    private String Bill;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isCarrybagAdded;
    private boolean isBillGenerated;
    
    public Pizza(boolean isVeg, String Size){
        if(Size.equals("Regular")){
            if(isVeg){
                BasePrice = 100;
            }else{
                BasePrice = 140;
            }
        }
        else{ // if it is a large pizza
            if(isVeg){
                BasePrice = 200;
            }
            else{
                BasePrice = 250;
            }
        }
        
        
        this.CheesePrice= 50;
        this.ToppingsPrice = 70;
        this.CarrybagPrice = 10;
        
        TotalAmount = BasePrice;
        
        Bill = "The base of the selected pizza is: " + BasePrice + "\n";
        
        
    }
    
    public void addExtraCheese(){
        if(isCheeseAdded == false){
            isCheeseAdded = true;
            TotalAmount = TotalAmount + CheesePrice;
            Bill = Bill + "Extra Cheese Added : " + CheesePrice +"\n";
            System.out.println( "the bill is :" + Bill);
        }
    }
    
    public void addExtraToppings(){
        if(isToppingsAdded == false){
            isToppingsAdded = true;
            TotalAmount = TotalAmount + ToppingsPrice;
            Bill = Bill + "Extra Toppings Added : " + ToppingsPrice+"\n";
            System.out.println( "the bill is :" + Bill);
        }
    }
        
    
    public void addCarrybag(){
        if(isCarrybagAdded == false){
            isCarrybagAdded = true;
            TotalAmount = TotalAmount + CarrybagPrice;
            Bill = Bill + "Carry Bag Added : " + CarrybagPrice+"\n";
            
            System.out.println( "the bill is :" + Bill);
        }
    
    }
    
    public void printbill(){
        if(isBillGenerated == false){
            isBillGenerated = true;
            Bill ="Total bill is : " + TotalAmount;
            
        }
        System.out.println(Bill);
        
    }
}
