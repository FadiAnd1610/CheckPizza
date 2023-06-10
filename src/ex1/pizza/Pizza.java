//Assignment:1
//Author: Fadi Andrawis , ID: 324085174

package ex1.pizza;

/**
 * This class represents pizza
 */
public class Pizza {
    /**
     * we have here 4 Fields
     */
    private int size;
    private boolean extracheese;
    private boolean olives;
    private boolean onion;

    /**
     * constructor that accepts values for all instance variables
     * @param size represents thr size of the pizza
     * @param extracheese represents the Toppings on the pizza
     * @param olives represents the Toppings on the pizza
     * @param onion represents the Toppings on the pizza
     */

    public Pizza(int size, boolean extracheese, boolean olives, boolean onion) {
        this.size = size;
        this.extracheese = extracheese;
        this.olives = olives;
        this.onion = onion;
    }

    /**
     *  Pizza constructor that builder with default variables.That is,0 for an int variable and false for a Boolean variable.
     */
    public Pizza() {
        size=0;
        extracheese=false;
        olives=false;
        onion=false;
    }

    /**
     * Constructor that accepts an existing pizza instance and copies the variables
     * @param other use for the copy constructor
     */
    public Pizza(Pizza other) {
        this.size = other.size;
        this.extracheese = other.extracheese;
        this.olives = other.olives;
        this.onion = other.onion;
    }

    /**
     * getsize to get the value of the variable
     * @return the size
     */

    public int getSize() {
        return this.size;
    }

    /**
     * getextracheese to get the value of the variable
     * @return the extracheese
     */

    public boolean getextracheese() {
        return this.extracheese;
    }

    /**
     * getOlives to get the value of the variable
     * @return the Olives
     */

    public boolean getOlives() {
        return this.olives;
    }

    /**
     * getOnion to get the value of the variable
     * @return the Onion
     */

    public boolean getOnion() {
        return this.onion;
    }

    /**
     * setsize is used to set the variable to a some value;
     * @param size the name of the variable
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * setCheeseTopping is used to set the variable to a some value
     * @param extracheese the name of the variable
     */

    public void setCheeseTopping(boolean extracheese) {
        this.extracheese = extracheese;
    }

    /**
     * setOliveTopping is used to set the variable to a some value
     * @param olives the name of the variable
     */

    public void setOliveTopping(boolean olives) {
        this.olives = olives;
    }

    /**
     * setOnion is used to set the variable to a some value
     * @param onion the name of the variable
     */

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    /**
     * calcCost method refunds the cost of a full pizza
     * @return the cost of the pizza
     */

    public int calcCost() {
        int cost = 0;
        if (size == 0) {
            cost = cost + 35;
            if (extracheese == true)
                cost = cost + 6;
            if (olives == true)
                cost = cost + 6;
            if (onion == true)
                cost = cost + 6;
        }
        if (size == 1) {
            cost = cost + 45;
            if (extracheese == true)
                cost = cost + 7;
            if (olives == true)
                cost = cost + 7;
            if (onion == true)
                cost = cost + 7;
        }
        if (size == 2) {
            cost = cost + 60;
            if (extracheese == true)
                cost = cost + 9;
            if (olives == true)
                cost = cost + 9;
            if (onion == true)
                cost = cost + 9;
        }
        return cost;
    }

    /**
     * @return a string containing the description of the pizza: the size of the pizza, and a description
     *      * All the addition.
     */

    public String toString() {
        String size1 = "";
        String extra1 = "";
        String extra2 = "";
        String extra3 = "";
        if (size == 0)
            size1 = "small";
        if (size == 1)
            size1 = "medium";
        if (size == 2)
            size1 = "large";
        if (extracheese == true)
            extra1 = "extra cheese topping";
        if (olives == true)
            extra2 = "olives topping";
        if (onion == true)
            extra3 = "onion topping";
        if (extracheese == true || onion == true || olives == true) {
            return "pizza size " + size1 + "+" + extra1 + "+" + extra2 + "+" + extra3;
        }
        return "pizza size " + size1 + "(with no toppings)";
    }

    /**
     * equal method that Compares two pizzas
     * @param obj the object that we want to Compare to
     * @return a Boolean value true if they are the same
     */

    public boolean equals(Object obj) {
        if (obj==this)
            return true;
        if (!(obj instanceof Pizza))
            return false;
        Pizza piz = (Pizza) obj;
        return size == piz.getSize() && extracheese== piz.extracheese && olives== piz.olives && onion== piz.getOnion();

    }
}
