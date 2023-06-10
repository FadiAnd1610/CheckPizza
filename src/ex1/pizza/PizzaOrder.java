//Assignment:1
//Author: Fadi Andrawis , ID: 324085174

package ex1.pizza;

import java.util.Arrays;

    /**
     *  The class allows the user to create an order for himself.
     * The customer can order max of three pizzas.
     */

    public class PizzaOrder {
        /**
         * Class Fields
         */
        private int numofpizza =0;
        private String name;
        private String lastName;
        private static final int MAX_PIZZAS=3;
        private Pizza[] pizzas = new Pizza[MAX_PIZZAS];

        /**
         * Constructs a pizza order object with the full details that the customer needs to enter.
         * @param name The name of the customer
         * @param lastName The last name of the customer
         * @param pizzas All the pizzas that the customer want to order.
         */

        public PizzaOrder(String name, String lastName, Pizza[]pizzas) {
            this.name= name;
            this.lastName= lastName;
            this.pizzas= pizzas;
        }

        /**
         * @return A string that describing the pizza order like name , last name and to be continued...
         */

        public String toString() {
            return "customer name:" +name+ " " + lastName + ", pizzas= " + Arrays.toString(pizzas);
        }

        /**
         * A method that checks if two objects are the same
         * @param o the object that we want to Compare to
         * @return a Boolean value true if they are the same
         */
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof PizzaOrder)) {
                return false;
            }
            PizzaOrder piz = (PizzaOrder) o;
            if (this.numofpizza != piz.numofpizza)
                return false;
            boolean check[] = new boolean[numofpizza];
            for (int f = 0; f < numofpizza; f++)
                check[f] = false;
                for (int i = 0; i < numofpizza; i++) {
                    for (int l = 0; l < numofpizza; l++) {
                        if (pizzas[i].equals(piz.pizzas[l]) && check[l] == false) {
                            check[l] = true;
                            break;
                        }
                    }
                }
                boolean bo = true;
                for (int q = 0; q < check.length; q++) {
                    bo = bo && check[q];
                }
            return name == piz.name && lastName == piz.lastName && bo;
            }

        /**
         * A method that allows to add pizzas to the order array.
         * If the array is already full so the method will not add the pizza
         * @param size The size of pizza
         * @param cheese topping
         * @param onion topping
         * @param olives topping
         */
          public void addPizza (int size, boolean cheese,boolean onion, boolean olives) {
            for (int i=0; i<MAX_PIZZAS; i++)
            {
                if (pizzas[i]== null) {
                    numofpizza++;
                    pizzas[i]= new Pizza(size,cheese,onion,olives);
                    break;
                }
            }
        }

        /**
         * A method that calculates the total amount of the order
         * @return The total of the order.
         */
        public int calcTotal() {
            int sum=0;
            for (int i=0; i<MAX_PIZZAS; i++) {
                if (pizzas[i]!=null)
                    sum+= pizzas[i].calcCost();
            }
            return sum;
        }

        /**
         * A method that prints all the details about the customer's order
         */
        public void tab() {
            System.out.println("Customer name- " + name+ " "+ lastName);
            for (int j=0; j<MAX_PIZZAS;j++) {
                if (pizzas[j]!=null)
                    System.out.println(pizzas[j].toString()+ " pizza price: "+ pizzas[j].calcCost());
            }
            System.out.println("=================================");
            System.out.println("Total sum -"+ calcTotal());
        }
    }
