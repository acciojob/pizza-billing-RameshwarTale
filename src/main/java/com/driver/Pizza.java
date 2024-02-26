package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isAddExtraCheese = false;

    boolean isAddExtraToppings = false;
    int topping = 0;
    boolean isAddTakeaway = false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: "+ this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isAddExtraCheese==false){
           this.price = this.price+80;
            this.isAddExtraCheese = true;
        }
    }

    public void addExtraToppings(){

        if(isAddExtraToppings == false){
            if(isVeg){
                this.topping = 70;
                this.price = this.price+70;
            }
            else{
                this.topping = 120;
                this.price = this.price+120;
            }
            this.isAddExtraToppings = true;
        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isAddTakeaway==false){
            this.price = this.price+20;
            this.isAddTakeaway = true;
        }
    }

    public String getBill(){

         if(isAddExtraCheese==true){
             this.bill = this.bill+"Extra Cheese Added: "+80+"\n";
         }
         if(isAddExtraToppings){
             this.bill = this.bill+"Extra Toppings Added: "+this.topping+"\n";
         }
         if(isAddTakeaway){
             this.bill = this.bill+"Paperbag Added: "+20+"\n";
         }
         this.bill = this.bill+"Total Price: "+this.price+"\n";
        return this.bill;
    }
}