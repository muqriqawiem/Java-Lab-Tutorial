package WIA1002.TUTO.TUTO_3;

public class Q1 {
    /*
    Your tasks are to design ADTs to represent the three classes:
    
a. Identify the instance variables for each of the class (i.e. Dispenser, Cash Register, Candy 
Machine)
    
b. Identify the methods/operations for each of the class (i.e. Dispenser, Cash Register, Candy 
Machine)
    
c. Produce a UML class diagram to represent the three classes
    */
    
    /*
    Dispenser
- Instance Variables
  Number of items – The number of items hold by the dispenser.
  Products cost – The cost of the item
    
- Method or Operation
  Release Items – Releasing number of items requested from the dispenser to be sold
  Calculate total cost of Items – Counting the number of items requested and calculate the total
  cost.
    */
    
    /*
    CandyMachine
- Instance Variables
  Products Name – The name of the products to be sold
- Method or Operation
  Show Items – Show the customer variety of items that they can select
  Select Items – Customers select the items that they want to buy
    */
    
    /*
    CashRegister
- Instance Variable
  Total transaction cash – total cash on hand to perform transaction on selling the products
- Method or Operation
  Accept cash from customer – Accepting cash paid by the customers for the products that they want to buy
  Return change to the customer – Returning money change to the customers if they paid more than the actual cost of the products they buy
    */
}
