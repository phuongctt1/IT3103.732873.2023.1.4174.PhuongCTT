/**
 * 
 * @author Cao Thi Thu Phuong
 *
 */
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    //This method adds a DVD object to the cart if the quantity of discs in the cart is not ful
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    // If the cart is already full, the method will print "The cart is full, cannot add disc" message.
        else {
            System.out.println("The cart is full, cannot add disc");
        }
    }
    // This method removes a DVD object from the cart if it exists in the cart.
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        DigitalVideoDisc itemsOrderedRemoved[] = new DigitalVideoDisc[qtyOrdered - 1];
        int j=0;
        for (int i=0; i<qtyOrdered; ++i) {
            if (itemsOrdered[i] != disc) {
                itemsOrderedRemoved[j] = itemsOrdered[i];
                j++;
            }
        }
        //After the DVD object is removed, the quantity of discs in the cart will be decreased by 1
        qtyOrdered--;
        itemsOrdered = itemsOrderedRemoved;
        System.out.println("The disc has been removed");
    }
    //This method returns the total cost of all the objects in the cart by iterating through the itemsOrdered array
    //and calculating the total cost of each object using the getCost() method of the DigitalVideoDisc class and adding it to the totalCost variable.
    //Finally, the method will return the value of totalCost.
    public float totalCost()
    {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++)
        {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
}
