//Assignment:1
//Author: Fadi Andrawis , ID: 324085174

package ex1.pizza;
    public class PizzaOrderMain {
        public static void main(String[] args) {
            /**
             * 2 array with max of 3 pizzas
             */
            Pizza[] a = new Pizza[3];
            Pizza[] b = new Pizza[3];
            /**
             * i make 2 orders of a pizza
             */

            PizzaOrder order1 = new PizzaOrder("fadi", "Andrawis", a);
            PizzaOrder order2 = new PizzaOrder("Leo", "Messi", b);
            order1.addPizza(0, true, false, true);
            order1.addPizza(1, true, false, false);
            order2.addPizza(2, true, true, true);
            order2.addPizza(2, true, true, true);
            order2.addPizza(2, true, true, true);
            /**
             * Printing a bill for two orders
             */
            order1.tab();
            order2.tab();
            /**
             * Comparing the two orders and issuing a suitable printout.
             */
            if (order1.equals(order2))
                System.out.println(" the orders are equal");
            else{
                System.out.println("The orders are NOT equal!!");
            }
        }
    }

