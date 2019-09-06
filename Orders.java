//  Sukhamrit Singh
//  Orders
/*
This is a program that calculates information about orders
of shirts and pants. All orders have a quantity and a color.
The program will then go through the array to calculate and print,
properly labeled:
•The total number of shirts ordered and the total price
•The total number of pants ordered and their total price
•The average waist size (to one decimal place)
•The average inseam length (to one decimal place)
 */

//  Imports the necessary libraries
import java.util.ArrayList;
import java.util.List;

public class Orders {
    public static void main(String[] args) {

        //  Defining the array for the clothing orders
        List<Clothing> clothingList = new ArrayList<Clothing>();

        //  Creating a clothing object and adding to the array
        Shirt order1 = new Shirt(8, "Green", "XXL");
        clothingList.add(order1);

        //  Creating an clothing object and adding to the array
        Pants order2 = new Pants(6, "Brown", 48, 30);
        clothingList.add(order2);

        //  Creating an clothing object and adding to the array
        Shirt order3 = new Shirt(2, "White", "M");
        clothingList.add(order3);

        //  Creating an clothing object and adding to the array
        Pants order4 = new Pants(4, "Blue", 36, 34);
        clothingList.add(order4);


        //  Defining variable to get total shirts
        int totalShirts = order1.getQuantity() +
                order3.getQuantity();

        //  Defining variable to get total pants
        int totalPants = order2.getQuantity() +
                order4.getQuantity();

        //  Defining variable to get total for order 1
        double total1 = order1.getQuantity() *
                order1.calculatePrice();

        //  Defining variable to get total for order 2
        double total2 = order2.getQuantity() *
                order2.calculatePrice();

        //  Defining variable to get total for order 3
        double total3 = order3.getQuantity() *
                order3.calculatePrice();

        //  Defining variable to get total for order 4
        double total4 = order4.getQuantity() *
                order4.calculatePrice();

        //  Defining variable to get total shirts
        double shirtPrice = total1 + total3;

        //  Defining variable to get total pants
        double pantsPrice = total2 + total4;

        //  Defining variable to get average waste
        double avgWaist = (order2.getWaist() +
                order4.getWaist()) / 2;

        //  Defining variable to get average inseam
        double avgInseam = (order2.getInseam() +
                order4.getInseam()) / 2;

        //  Printing the output of the orders
        System.out.println("Total number of shirts ordered: " +
                totalShirts);
        System.out.printf("Total price of all shirts: $%.2f",
                shirtPrice);
        System.out.println("");
        System.out.println("Total number of pants ordered: " +
                totalPants);
        System.out.printf("Total price of all parts: $%.2f",
                pantsPrice);
        System.out.println("");
        System.out.println("Average waist size: " + avgWaist);
        System.out.println("Average inseam size: " + avgInseam);
    }
}

//  Creating a class to gather the clothing data
class Clothing {
    //  Defining two variables
    public int quantity;
    public String color;

    //  Creating no-argument constructor
    Clothing() {
        this(0, "");
    }

    //  Creating two-parameter constructor
    Clothing(int quantity, String color) {
        this.quantity = quantity;
        this.color = color;
    }

    //  Creating getter and setters for the variables
    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //  Method to calculate price
    public double calculatePrice() {
        //  returning 0.0
        return 0.0;
    }
}

//  Creating a class to gather data for shirts
class Shirt extends Clothing {
    //  Defining a variable
    public String size;

    //  Creating no-argument constructor
    Shirt() {
        this.size = "";
    }

    //  Creating three-parameter constructor
    Shirt(int quantity, String color, String size) {
        super(quantity, color);
        this.size = size;
    }

    //  Getter and setter for the variable
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //  Method to calculate price based on shirt size
    public double calculatePrice() {
        //  Created a variable
        double price;

        //  If statement to define price based on size
        if (size == "S")
            price = 11;
        else if (size == "M")
            price = 12.50;
        else if (size == "L")
            price = 15;
        else if (size == "XL")
            price = 16.50;
        else
            price = 18.50;

        //  retuning price
        return price;
    }
}

//  Creating a class to gather data for shirts
class Pants extends Clothing {
    //  Defining two variables
    public int waist;
    public int inseam;

    //  Creating no-argument constructor
    Pants() {
        this.waist = 0;
        this.inseam = 0;
    }

    //  Creating four-parameter constructor
    Pants(int quantity, String color, int waist, int inseam) {
        super(quantity, color);

        //  If statement to use absolute value if less than 0
        if (waist < 0)
            this.waist = Math.abs(waist);
        else
            setWaist(waist);

        //  If statement to use absolute value if less than 0
        if (inseam < 0)
            this.inseam = Math.abs(inseam);
        else
            setInseam(inseam);
    }

    //  getter and setter for the variables
    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        if (waist <= 0)
            this.waist -= waist;
        else
            this.waist = waist;
    }

    public int getInseam() {
        return inseam;
    }

    public void setInseam(int inseam) {
        if (inseam <= 0)
            this.inseam -= inseam;
        else
            this.inseam = inseam;
    }

    //  Created a method to calculate price based on sizes
    public double calculatePrice() {
        //  Creates a variable
        double price;

        //  If statement to define price based on sizes
        if (waist > 48 || inseam > 36)
            price = 65.50;
        else
            price = 50;

        //  returns price
        return price;
    }
}
